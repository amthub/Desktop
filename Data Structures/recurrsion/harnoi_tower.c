#include<stdio.h>

// int harnoi(int t, int A, int B, int C)
// {
//     if(t>0)
//     {
//         harnoi(t-1, 1, 3, 2);
//         printf("from %d to %d \n", A,C);
//         harnoi(t-1, 2, 1, 3);
//     }
// }



int main(){
    harnoi(2,1,2,3);
    return 0;
}