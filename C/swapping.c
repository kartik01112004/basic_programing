#include <stdio.h>


void swapV(int x, int y){
    int temp;
    temp = x;
    x = y;
    y = temp;
    printf("After swapping, x = %d and y = %d\n", x, y);
}
void swapR(int *x, int *y) {
    int temp;
    temp = *x;
    *x = *y;
    *y = temp;
    printf("After swapping, x = %d and y = %d\n", *x, *y);
}

int main() {
    printf("call by value");
    int num1 = 5, num2 = 10;
    printf("Before swapping, num1 = %d and num2 = %d\n", num1, num2);
    swapV(num1, num2);
    printf("Back in main, num1 = %d and num2 = %d\n", num1, num2);

    printf("call by reference");
    int num1 = 5, num2 = 10;
    printf("Before swapping, num1 = %d and num2 = %d\n", num1, num2);
    swapR(&num1, &num2);
    printf("Back in main, num1 = %d and num2 = %d\n", num1, num2);
    return 0;

}
