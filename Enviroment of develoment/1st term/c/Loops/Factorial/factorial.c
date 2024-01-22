#include<stdio.h>
 int main(){
    int n,facto=1;
    printf("Enter a number for the: ");
    scanf("%i",&n);
     while(n>0)
        {
        facto=n*facto;
        --n;
     }
     printf("factorial = %i",facto);

    return 0;
 }
