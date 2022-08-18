#include<stdio.h>

int main(){
    int grade;
    printf("Enter the value of your grade\n");
    scanf("%d", &grade);

    if(90<grade<100){
        printf("Your grade is a\n");
    }
    else if(80<grade<90){
        printf("Your grade is b\n");

    }
    else{
        printf("Your are fail\n");
    }
    return 0;
}
