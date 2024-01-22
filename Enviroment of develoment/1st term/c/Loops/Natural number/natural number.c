#include<stdio.h>
 int main(){
    int n,count=1,sum=0;
    printf("Enter a number for the: ");
    scanf("%i",&n);
     while(n>=count)
        {
        sum=sum+count;
        ++count;
     }
     printf("sum= %i",sum);

    return 0;
 }
