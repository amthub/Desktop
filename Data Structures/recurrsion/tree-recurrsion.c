#include<stdio.h>

int fun(int n)
{
    if(n>0)
    {
        printf("%d\n", n);
        fun(n-1);
        fun(n-1);
    }
}
void main()
{
    int x=3;
     fun(x);
}