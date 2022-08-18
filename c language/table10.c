
#include<stdio.h>

int main(){
    int n, sum=0;
    printf("Enter the value of n\n");
    scanf("%d", &n);

    for(int i=1;i<=10;i++){
        printf("%d X %d = %d\n",n, i, n*i);
        sum+=n*i;
    }
    printf("The value of sum is %d\n", sum);

    return 0;
}