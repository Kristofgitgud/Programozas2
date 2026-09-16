#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#ifdef _WIN32
    #include <direct.h>
    #include <io.h>
    #define make_dir(path) _mkdir(path)
    #define dir_exists(path) (_access(path, 0) == 0)
#else
    #include <sys/stat.h>
    #include <sys/types.h>
    #include <unistd.h>
    #define make_dir(path) mkdir(path, 0755)
    #define dir_exists(path) (access(path, F_OK) == 0)
#endif

void get_folder_name(int szam, char *hova, size_t max_hossz)
{
    snprintf(hova, max_hossz, "lattam_%02d", szam);
}

int main(int argc, char *argv[])
{
    char nev[32];
    char uj_nev[32];

    if (argc >= 2)
    {
        int megadott = atoi(argv[1]);
        if (megadott <= 0)
        {
            fprintf(stderr, "Hiba: Pozitiv egesz szamot adj meg!\n");
            return 1;
        }

        get_folder_name(megadott, nev, sizeof(nev));
        if (dir_exists(nev))
        {
            return 0;
        }

        if (make_dir(nev) != 0)
        {
            fprintf(stderr, "Hiba a mappa letrehozasakor!\n");
            return 1;
        }
        return 0;
    }

    int lattam_szam = 0;
    for (int i = 1; i < 1000; ++i)
    {
        get_folder_name(i, nev, sizeof(nev));
        if (dir_exists(nev))
        {
            lattam_szam = i;
            break;
        }
    }

    if (lattam_szam == 0)
    {
        get_folder_name(1, nev, sizeof(nev));
        if (make_dir(nev) != 0)
        {
            fprintf(stderr, "Hiba a mappa letrehozasakor!\n");
            return 1;
        }
    }
    else
    {
        get_folder_name(lattam_szam + 1, uj_nev, sizeof(uj_nev));
        if (rename(nev, uj_nev) != 0)
        {
            fprintf(stderr, "Hiba a mappa atnevezesekor!\n");
            return 1;
        }
    }

    return 0;
}