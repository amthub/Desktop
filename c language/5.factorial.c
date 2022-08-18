#include<stdio.h>

 int factorial(int x);

int main(){
    int n;
    printf("Enter the value of n\n");
    scanf("%d", &n);

    printf("The value of factorial is %d is %d",n, factorial(n));
    return 0;
}

int factorial(int x){
    if(x==1 || x==0){
        return 0;
    }
    else{
        return x*(x-1);
    }
}