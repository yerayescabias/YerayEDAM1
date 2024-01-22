#include<stdio.h>

int main()
{
    char o;
    int a;
    int b;
    int c;

    printf(" Decide between +,-,* or /:");
    scanf("%c",&o);
    printf(" pick the first number:");
    scanf("%i",&a);
    printf(" pick the second number:");
    scanf("%i",&b);

    switch(o)
    {
       case '+':

       c=a+b;

       printf( "the sum result is:%i\n",c);
       break;

       case '-':

       c=a-b;

       printf( "the sum result is:%i\n",c);
       break;

       case '*':

       c=a+b;

       printf( "the sum result is:%i\n",c);
       break;

       case '/':

       c=a+b;

       printf( "the sum result is:%i\n",c);
       break;

       default:
       printf (" Wrong character");
  }
       return 0;
}
