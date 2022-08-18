#include<stdio.h>

int main(){
    int i, n, prime=1;
    printf("Enter your number\n ");
    scanf("%d", &n);

    for(int i=2; i<n; i++){

        if(n%i==0){
            prime=0;
            break;
        }
    }
    if(prime==0){
    printf("It is not a prime number\n");
    }
        else{
            printf("It is  a prime number\n ");
        }
    
    return 0;
}