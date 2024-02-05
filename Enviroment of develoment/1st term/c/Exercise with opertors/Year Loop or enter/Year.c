#include<stdio.h>
int main() {
    int num1;
    printf("Enter a Year:");
    scanf("%i",&num1);

    if(num1 % 4 == 0 || num1 %400==0 && num1 %100!=0)
    {
        printf("The year is leap ");

        }else{
            printf("The year isn't a leap year");
        }

        return 0;
    }







