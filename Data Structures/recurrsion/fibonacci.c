#include<stdio.h>
int f[10];
int fibo(int n)
{
    static int s = 0;
    if(n<=1)
  {
     f[n] = n;
     return n;
  }
    else{
        if(f[n-1]==-1)
        {
            f[n-1]==fibo(n-1);
        }
        if(f[n-2]==-1)
        {
            f[n-2]==fibo(n-1);
        }
          return fibo(n-2)+fibo(n-1);
    }
}
int main(){
    int r = fibo(7);
    printf("%d", r);
    return 0;
}