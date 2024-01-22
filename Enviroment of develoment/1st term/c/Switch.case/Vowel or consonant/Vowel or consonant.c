#include <stdio.h>

int main()
{
  char c;

  printf("Write a vocal or a consonant:");
  scanf("%c",&c);
  switch (c){
        case 'a':
        printf("vowel");
        break;
         case 'i':
        printf("vowel");
        break;
         case 'o':
        printf("vowel");
        break;
         case 'u':
        printf("vowel");
        break;
         case 'e':
        printf("vowel");
        break;

        default:
        printf("It's consonant");
        break;


    }
return 0;

}
