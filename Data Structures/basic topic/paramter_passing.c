#include<stdio.h>

// void swap(int x, int y)
// {
//     int temp;
//     temp = x;
//     x=y;
//     y=temp;

// }
// //   call by address
// int main()
// {
//     int a=10,b=20;
//     swap(a,b);
//     // there will be no change in value of actual parameters
//     printf("%d %d", a,b);
    
// }

// call by address
void swap(int *x,int *y)
{
    int temp;
    temp = *x;
    *x = *y;
    *y = temp;
}

int main()
{
    int a=10, b=20;
    swap(&a, &b);
    printf("%d %d", a,b);
}