#include<stdio.h>

//    recursion
// int C(int n, int r)
// {
//     if(r==0 || n==r)
//     {
//         return 1;
//     }
//     else{
//         return C(n-1, r) + C(n-1, r-1);
//     }
// } 

//    by fact
int fact(int m)
{
    if(m==1 )
    {
        return 1;
    }
    else{
        return fact(m-1)*m;
    }
}
int C(int n, int r)
{
    int t,q,s;
    t=fact(n);
    q=fact(r);
    s=fact(n-r);
    return t/(q*s);
}
void main()
{
    
    printf("%d", C(4,2));
}