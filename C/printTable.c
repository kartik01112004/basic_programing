#include<stdio.h>
int main(){
    int i,j,num,value;
    printf("enter the value for till where you wanna get output for(eg- 10 that means 5X10..): ");
    scanf("%d", &num);
    printf("enter till the number you want results : ");
    scanf("%d", &value);
    for(i=1;i<=num;i++){
        for(j=1;j<=value;j++){
            printf("%d*%d=%d, ", i,j,i*j);
            printf("\n");
        } 
        printf("\n");
    } 
    }
