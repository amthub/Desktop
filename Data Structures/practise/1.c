#include<stdio.h>

int fun(int m)
{
    if(m>0)
    {
        return fun(m-1)*m;
    }
    else{
        return 1;
    }
}
void main()
{
   int a = fun(5);
    printf("%d", a);
}