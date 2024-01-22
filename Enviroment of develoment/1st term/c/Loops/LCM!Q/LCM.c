#include<stdio.h>
 int main(){
    int n1,emaitza;
    printf("Enter a number: ");
    scanf("%i",&n1);
     while(n1>0)
        {
        emaitza=n1%10;
        printf("%i ",emaitza);
        n1=n1/10;
     }


    return 0;
 }
