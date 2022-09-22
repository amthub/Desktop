#include<stdio.h>
#include<stdlib.h>
struct Rectangle{
    int length;
    int breadth;
};

// int main()
// {
//      struct Rectangle r = {10,5};
     
//      struct Rectangle  *p;      
//     //  structure to pinter
//      p=&r;
//      or u can use p 
//      (*p).length = 22;
//      printf("%d", r.length);

// }


// memory in heap -: use malloc
// malloc returns void pointer 
int main()
{
    struct Rectangle *p = (struct Rectangle *)malloc(sizeof(struct Rectangle));
    (*p).length = 15;
     p->breadth = 22;
     printf("%d", p->length);
     
}