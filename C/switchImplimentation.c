#include<stdio.h>
int main(){
    int a,b,c;
    int ch;
    printf("value1 : ");
    scanf("%d", &a);
    printf("value2 : ");
    scanf("%d", &b);
    printf("1 for add, 2 for sub, 3 for multiply, 4 for division : \n");
    scanf("%d", &ch);

    switch (ch)
    {
    case 1:
        c = a+b;
        printf("add is %d", c);
        break;
    case 2 :
        c=a-b;
        printf("sub is %d", c);
        break;
    case 3:
        c = a*b;
        printf("multiply is %d", c);
        break;
    case 4:
        c = a/b;
        printf("division is %d", c);
        break;
    
    default:{printf("%d is wrong input", ch);}
        break;
    }
}
