#include<stdio.h>

    struct Rectangle{
        int length;
        int breadth;
        char x;
    };
   

int main()
{
    

    struct Rectangle r = {10, 5, "amit"};
    printf("%d\n", r.length);
    printf("%d\n", r.breadth);
    
    printf("%d\n", sizeof(r));

    //  chnage length and breadth
    r.length = 12;
    r.breadth = 23;

    printf("%d\n", r.length);
    printf("%d\n", r.breadth);

    // Array of structure
    struct Cards{
        // Cards have 13 face, 4 shapes and color
        int face;               
        int shape;
        int color;
    };
    struct Cards deck[52] = {{1,0,0}, {2,0,0}};
    printf("%d\n", deck[0].face);
    printf("%d\n", deck[0].shape);
    printf("%d\n", deck[0].color);
    return 0;
}