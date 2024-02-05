#include<stdio.h>

int main()
{
    int number, contador=0;

    printf("Enter a number: ");
    scanf("%i", &number);
    number=abs(number);

    while( number>0){
        number = number/10;
        contador ++;
    }

    printf("There are %i digits",contador);

    return 0;
}
