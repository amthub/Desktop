#include<stdio.h>

int main(){
    int grade;
    printf("Enter the grade is \n");
  scanf("%d", &grade);

    if(grade>=90&&grade<=100){
        printf("Your grade is A\n");
    }
    else{
        printf("Your are fail\n");
    }
    return 0;
}