#include <stdio.h>

int main ()
{
 int j,i,result, avere;
 printf("Enter a number: ");
 scanf("%i",&j);
  printf("Enter another number: ");
 scanf("%i",&i);

    result=multiply(i,j);
printf("The result of %i x %i = %i\n",i,j,result);
    avere= average(i,j);
    printf("The average of %i and %i is %i",i,j,avere);
 }
int multiply (int a, int b)
{
    int r;
    r=a*b;

    return r;
}

int average(int c, int d)
{
    int p;
    p=(c+d)/2;

    return p;
}
