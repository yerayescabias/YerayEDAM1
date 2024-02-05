#include<stdio.h>
int main() {
    double y2,y3,X1,X2,y1,ax2,bx,c;
    printf("Enter first number ax2:");
    scanf("%lf  ",&ax2);
    printf("Enter second number bx:");
    scanf("%lf",&bx);
    printf("Enter third number c:");
    scanf("%lf",&c);
    y1=(bx*bx)-(4*ax2*c);
    if(y1>=0){
        y2= sqrt(y1);
            y3=ax2*2;
    X1=(-(bx)+(y2))/y3;
    X2=(-(bx)-(y2))/y3;
    printf("The results of this cuadratic station are %lf",X1);
    printf(" and %lf",X2);
    }
    else{
        printf("negative result in the square root\n");
    }

return 0;
}
