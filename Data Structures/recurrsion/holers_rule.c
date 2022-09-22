#include<stdio.h>

// double holer(int x, int n)
// {
//      int s=1;
//      for(;n>0; n--)
//      {
//           s=1+(x/n*s);
//      }
//      return s;
// }

//    Recursive function
double e(int x, int n)
{ 
    static double s=1;
     if(n>0)
    {
         s=1+(x/n)*s;
        return  e(x, n-1);
     }
     else{
        return s;
     }
}
int main(){
    printf("%1f",e(1,4));
    return 0;
}