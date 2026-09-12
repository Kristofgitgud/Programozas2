#include <stdio.h>

void tomb_kiir(int tomb[], int n)
{
    printf("{");
    for (int i = 0; i < n-1; ++i)
    {
        printf("%d, ", tomb[i]);
    }
    printf("%d}\n", n-1);
}

int keres(int tomb[], int szam, int n)
{
    for (int i = 0; i < n; ++i)
    {
        if (szam == tomb[i])
        {
            return i;
        }
    }
    return -1;
}

int main()
{
    int tomb[10] = {5, 8, 2, 4, 3, 1, 9, 7, 6, 11};
    int keresendo_szam = 1;

    tomb_kiir(tomb, 10);

    int talalt_index = keres(tomb, keresendo_szam, 10);
    if (talalt_index == -1)
    {
        printf("A(z) %d érték nem található a tömbben.\n", keresendo_szam);
    }
    else 
    {
        printf("A(z) %d érték a(z) %d indexen áll.\n", keresendo_szam, keres(tomb, keresendo_szam, 10));
    }
    
    return 0;
}

