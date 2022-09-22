#include<stdio.h>
#include<stdlib.h>
  
//  Array can only be call by addres 
//  so if u change the value in array at amy index it will also change actual array

//   void fun(int *A, int n)
// void fun(int A[], int n){
//         int i;
        
//         for(i=0; i<n; i++)
//         {
//             printf("%d\n", A[i]);
//         }
// }

// int main()
// {
//     int A[] = {10, 4, 76, 45, 7};
//     fun(A, 5);
// }

int *fun(int n)
{
    int *p;
    p = (int *)malloc(n*sizeof(int));

    for(int i=0; i<5; i++)
    {
        p[i] = i+1;
    }
    return (p);
}  

int main()
{
    int *ptr;
    ptr = fun(5);
    for(int i=0; i<5; i++)
    {
        printf("%d\n", ptr[i]);
    }
}