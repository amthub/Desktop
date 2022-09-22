#include<stdio.h>

struct Rectangle{
    int length;
    int breadth;
};

void initialise(struct Rectangle *r1, int l, int b)
{
    r1->length = l;
    r1->breadth = b;
    printf("%d %d\n", r1->length,r1->breadth);
}

int area(struct Rectangle r1)
{
    int area = r1.length*r1.breadth;
    printf("%d\n", area);
}

int changebreadth(struct Rectangle *r1, int b )
{
    r1->breadth = b;
    printf("new breadth: %d", r1->breadth);
}
int main()
{
    struct Rectangle r;

    initialise(&r, 10, 6);
    
    area(r);

    changebreadth(&r, 20);
}