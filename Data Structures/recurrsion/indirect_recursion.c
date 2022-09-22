#include<stdio.h>

void funB(int n);
void funA(int n)
{
    if(n>0)
    {
        printf("%d\n", n);
        funB(n-1);
    }
}

void funB(int m)
{
    if(m>0)
    {
        printf("%d\n", m);
        funA(m/2);
    }
}
void main()
{
    funA(20);
}