#include<stdio.h>
#include<stdlib.h>

void main()
{
    int a[] = {1, 2, 3, 4};

    int *p = (int*)malloc(5*sizeof(int));
    p[0] = 5;
    p[1] = 5;
    p[2] = 5;
    p[3] = 5;

    for(int i=0; i<5; i++)
    {
    printf("%d ", a[i]);
    }

    printf("\n");

    for(int i=0; i<5; i++)
    {
        printf("%d ", p[i]);
    }


}