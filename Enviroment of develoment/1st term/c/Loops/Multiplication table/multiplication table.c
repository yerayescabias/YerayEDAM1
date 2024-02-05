#include<stdio.h>
 int main(){
    int n,mu=0,result=0;
    printf("Enter a number between 1-10: ");
    scanf("%i",&n);
     while(mu<=10)
        {
        result=n*mu;
        printf("%i * %i = %i\n",n,mu,result);
         ++mu;
     }


    return 0;
 }
