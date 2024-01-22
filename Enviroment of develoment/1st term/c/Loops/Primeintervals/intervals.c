#include<stdio.h>
int main()
{
    int n1,a=0;
    printf("Enter a number between 1-10: ");
    scanf("%i",&n1);
    if(n1>0 && n1<=10)
    {
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
    } else
        {
        printf("The number is not appropiate");
        }

    return 0;
}
