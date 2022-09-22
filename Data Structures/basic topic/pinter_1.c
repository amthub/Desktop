#include<stdio.h>
#include<stdlib.h>

int main()
// {
//     // data variable
//     int a =10;    

//     // declaration of pointer
//     int *p;               
//     p = &a;

//     printf("%d\n", a);
//     //  address of a
//     printf("%d\n", p);

//     //  it prints value of a using pointer 
//     printf("%d\n", *p);


//     // acces heap memory using malloc
//     //  p = (int *)malloc(5*sizeof(int));
// }

{
    // Array inside heap

    int *p;
    p=(int *)malloc(3*sizeof(int));
    p[0] = 11;
    p[1] = 45;
    p[2] = 3;
    for(int i=0; i<3; i++)
    {
        printf("%d\n", p[i]);
    }
    free(p);
    return 0;
}