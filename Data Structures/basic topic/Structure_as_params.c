#include<stdio.h>
struct rectangle{
    int length;
    int breadth;
};

//   call by value
int area_by_value(struct rectangle r1)
{
    return r1.length*r1.breadth;
}

//  call by address
int area_by_address(struct rectangle *r1)
{
    return (r1->length)*(r1->breadth);
}


int main()
{
   struct rectangle r = {10,5};
   printf("%d\n", area_by_value(r));
   printf("%d\n", area_by_address(&r));
}


