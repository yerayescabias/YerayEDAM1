#include <stdio.h>
int main()
{
    int n1,power,emaitza=1;
    printf("Enter a number: ");
    scanf("%i",&n1);
    printf("Enter a power: ");
    scanf("%i",&power);
    for(int i=1;power>=i;++i)
    {
     emaitza*=n1;

    }
    printf("the result is %i",emaitza);

return 0;
}
