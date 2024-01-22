#include <stdio.h>

int main()
{
    int a,b,c;
    printf("Enter a number ");
    scanf("%i",&a);
    printf("Enter another number ");
    scanf("%i",&b);
     c=a+b;
    printf("The result of a+b is=%i\n",c);
     c=a-b;
      printf("The result of a-b is=%i\n",c);
     c=a*b;
    printf("The result of a*b is=%i\n",c);
     c=a/b;

    printf("The result of a/b is=%i\n",c);
     c=a%b;

    printf("The result of a: b is=%i/n",c);
    return 0;

}
