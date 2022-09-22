#include<stdio.h>

double e(int x, int m)
{
    static double p=1, n=1;
    double r;
     if(m==0)
     {
        return 1;
     }
     else{
        r =  e(x, m-1);
        p=p*x;
        n=n*m;
        return r+(p/n);
     }
}
void main()
{
    
    double series = e(1,4);
    printf("%f\n", series);
}