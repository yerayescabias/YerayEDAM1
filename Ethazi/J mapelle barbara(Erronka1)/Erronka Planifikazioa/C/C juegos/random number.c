#include<stdio.h>

int main()
{
    int num1,randomn,range2;
    char repeat;
    _Bool finish=1;
    do
    {
        printf("Between which numbers do you want to guess you only have 10 tries\n");
        printf("Select the highest number of the range to guess: ");
        scanf("%i",&range2);
        randomn=rand()%range2;
        printf("TIME TO GUESS!!!!\n");

        for(int chances=0;chances<=10 && finish;++chances)
        {

            printf("Enter a number: ");
            scanf("%i",&num1);
            if(num1>randomn)
            {
               printf("Your number is lower try again...\n");
            }
            else if(num1<randomn)
            {
                 printf("Your number is higher try again!!\n");
            }
            else if(num1=randomn)
            {
                printf("THAT'S THE NUMBER\n");
                printf("CONGRATULATION\n");
                finish=0;

            }
            else if(chances=10 && num1!=randomn)
            {
                printf("OH NO YOU'VE FAILED\n");
            }
        }

        printf("Do you want to repeat(Y/N): ");
        scanf("%c",repeat);
    }
    while(repeat=='Y');

    return 0;

}

