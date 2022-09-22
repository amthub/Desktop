#include<stdio.h>

// int sum=0;

// int fun(int n)
// {
//     if(n>0)
//     {
//         sum+=n;
//         fun(n-1);
//     }
// }

int  sum(int n)
{
    if(n==0)
    {
        return 0;
    }
    else{
        return sum(n-1) + n;
    }
}

int main(){
    
    
    printf("%d", sum(10));
    return 0;
}