#include<stdio.h>
int main(){
int m;
printf("Enter the length of Array\n");
scanf("%d", &m);

int A[m];

for(int i=0; i<m; i++)
{
    
    scanf("%d", &A[i]);
}
for(int j=0; j<m; j++)
{
    printf("%d\n", A[j]);
}
   return 0;
}
   