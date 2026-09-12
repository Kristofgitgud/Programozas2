#include <stdio.h>
#include <math.h>

typedef struct Koordinatak
{
    int x;
    int y;
} Pont;
double Distance(Pont A, Pont B)
{
    double tavolsag = sqrt((A.x-B.x)*(A.x-B.x) + (A.y-B.y)*(A.y-B.y));
    return tavolsag;
}

int main()
{
    Pont A;
    A.x = 1;
    A.y = 2;
    Pont B;
    B.x = 6;
    B.y = 5;

    printf("%f\n", Distance(A,B));

    return 0;
}