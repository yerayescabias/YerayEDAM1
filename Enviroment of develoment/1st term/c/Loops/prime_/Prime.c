#include<stdio.h>
int main()
{
    int n1,a=0;
    printf("Enter a number: ");
    scanf("%i",&n1);
    for(int i=1; n1>=i;++i)
    {
        if(n1 %i==0)
        {
          a++;
        }


    }
    if (a==2)
    {
      printf("The number is prime ");
    }else
    {
        printf("The number is not prime");
    }
     return 0;
}
