#include<stdio.h>

int main()
{
        char repeat;
        do{
            int choose=0,height=0;
            printf("which form do you want to do?\n");
            printf("1.Triangle\n");
            printf("2.Rombou\n");
            printf("3.Rectangle\n");
            printf("4.triangelu alreves\n");
            printf("5.rec alreves\n");
            printf("6.mkt \n");
            printf("Select: ");
            scanf("%i",&choose);
            printf("choose the height: ");
            scanf("%i",&height);

            switch (choose)
            {
            case 1:
                triangle(height);
                break;
            case 2:
                sandra(height);
                break;
            case 3:
                rectangle(height);
                break;
            case 4:
                alreves(height);
                break;
            case 5:
                lsl(height);
                break;
            default:
                break;
            }

        printf("Do you want to repeat?");
        scanf(" %c",&repeat);
        repeat=tolower(repeat);

        } while (repeat =='y');
        printf("Thank you for using the machine");



   return 0;
}
void rectangle(int height)
{
       for(int colu=1;colu<=height;colu++)
        {
        for(int rows=1;rows<=colu;rows++)
        {
            printf("* ");
        }
        printf("\n");


    }

}

void triangle(int height)
{
    for(int col=1;col<=height;col++)
    {
        for(int space=1;space<=height-(col);space++)
        {
            printf(" ");
        }
        for(int arrows=1;arrows<=((col)*2)-1;arrows++)
        {
            printf("*");
        }
        printf("\n");
    }



}

void alreves(height)
{
    for(int altu=height-1;altu>=1;altu--)
    {
        for(int spaces=1;spaces<=height-altu;spaces++)
        {
            printf(" ");
        }
        for(int asterisco=1;asterisco<=altu*2-1;asterisco++)
        {
            printf("*");
        }
    printf("\n");
    }
}
void sandra(height)
{
   for(int col=1;col<=height;col++)
    {
        for(int space=1;space<=height-(col);space++)
        {
            printf(" ");
        }
        for(int arrows=1;arrows<=((col)*2)-1;arrows++)
        {
            printf("*");
        }
        printf("\n");
    }
       for(int altu=height-1;altu>=1;altu--)
    {
        for(int spaces=1;spaces<=height-altu;spaces++)
        {
            printf(" ");
        }
        for(int asterisco=1;asterisco<=altu*2-1;asterisco++)
        {
            printf("*");
        }
    printf("\n");
    }
}

void lsl(height)
{
    for(int altu=height;altu>=1;--altu)
    {
        for(int asteri=1;asteri<=altu;asteri++)
        {
            printf("*");
        }
        printf("\n");
    }


}




