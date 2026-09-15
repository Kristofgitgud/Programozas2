#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

#ifdef _WIN32
  #include <direct.h>
  #include <io.h>
  #define make_dir(path) _mkdir(path)
#else
  #include <sys/stat.h>
  #include <sys/types.h>
  #include <dirent.h>
  #define make_dir(path) mkdir(path, 0777)
#endif

int ervenyes_szam(const char *str) {
    if (!str || *str == '\0') return 0;
    while (*str) {
        if (!isdigit((unsigned char)*str)) return 0;
        str++;
    }
    return 1;
}

int lattam_mappak(char *first_entry, size_t max_hossz) {
    int count = 0;
    first_entry[0] = '\0';

#ifdef _WIN32
    struct _finddata_t file_info;
    intptr_t handle = _findfirst("lattam_*", &file_info);
    if (handle != -1) {
        do {
            if (count == 0) {
                snprintf(first_entry, max_hossz, "%s", file_info.name);
            }
            count++;
        } while (_findnext(handle, &file_info) == 0);
        _findclose(handle);
    }
#else
    DIR *dir = opendir(".");
    if (dir) {
        struct dirent *entry;
        while ((entry = readdir(dir)) != NULL) {
            if (strncmp(entry->d_name, "lattam_", 7) == 0) {
                if (count == 0) {
                    snprintf(first_entry, max_hossz, "%s", entry->d_name);
                }
                count++;
            }
        }
        closedir(dir);
    }
#endif

    return count;
}

void arg_kezeles(const char *arg, int count) {
    if (count > 0) {
        fprintf(stderr, "Hiba: Már létezik a lattam mappa!\n");
        exit(1);
    }
    if (!ervenyes_szam(arg)) {
        fprintf(stderr, "Hiba: Nem érvényes szám\n");
        exit(1);
    }

    int num = atoi(arg);
    char dname[128];
    int szelesseg = (int)strlen(arg) < 2 ? 2 : (int)strlen(arg);
    snprintf(dname, sizeof(dname), "lattam_%0*d", szelesseg, num);

    if (make_dir(dname) != 0) {
        fprintf(stderr, "Hiba: Nem sikerült létrehozni a mappát: %s\n", dname);
        exit(1);
    }
}

int main(int argc, char *argv[]) {
    char first_entry[256];
    int count = lattam_mappak(first_entry, sizeof(first_entry));

    if (argc > 1) {
        arg_kezeles(argv[1], count);
        return 0;
    }

    if (count == 0) {
        if (make_dir("lattam_00") != 0) {
            fprintf(stderr, "Hiba: Nem sikerült létrehozni a kezdő mappát (lattam_00)\n");
            return 1;
        }
        return 0;
    }

    const char *num_part = first_entry + 7;
    int szelesseg = (int)strlen(num_part);
    int num = atoi(num_part);

    char uj_nev[256];
    snprintf(uj_nev, sizeof(uj_nev), "lattam_%0*d", szelesseg, num + 1);

    if (rename(first_entry, uj_nev) != 0) {
        fprintf(stderr, "Hiba: Nem sikerült átnevezni a mappát: %s -> %s\n", first_entry, uj_nev);
        return 1;
    }

    return 0;
}