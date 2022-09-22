#include<stdio.h>

// int fun(int n)
// {
//     if(n>0)
//     {
//         return fun(n-1) + n;
//     }
//     return 0;
// }


//   static variable
// int fun(int n)
// {
//    static int m=0;
 
//     if(n>0)
//     {
//         m++;
//         return fun(n-1) + m;
//     }
//     return 0;
// }

//  Global variable

int m=0;
int fun(int n )
{
    if(n>0)
    {
        m++;
        return fun(n-1) + m;
    }
    return 0;
}

//   Main function

void main()
{
    int x = 3;

    int r = fun(x);
    printf(("%d"), r);
}