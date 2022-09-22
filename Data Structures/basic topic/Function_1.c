#include<stdio.h>

int add(int a, int b)
{
   return a+b; 
}
int sub(int a, int b)
{
   
   return a>b?a-b:b-a ; 
}
int main()
{
    int c = add(4,5);
    int d = sub(4,5);
    printf("%d\n", c);
    printf("%d\n", d);
}