#include<stdio.h>
int main() {
    int num1;
    int num2;
    int num3;
    printf("Enter a number:");
    scanf("%i",&num1);
    printf("Enter another number:");
    scanf("%i",&num2);
    printf("Enter another number:");
    scanf("%i",&num3);
    if(num1>num2 && num1>num3)
    {
        printf("The max number is %i ",num1);
    }
    else if(num2>num1 && num2>num3)
    {
        printf("The max number is %i ",num2);
    }
    else
        {
        printf("The max number is %i",num3);
    }




return 0;
}
