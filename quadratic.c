#include<math.h>
int main()
{
float D,b,a,c,r1,r2;
printf("Enter the values of coeficient of quadratic equation");
scanf("%f%f%f", &b,&a,&c);
D=(b*b)-(4*a*c);
if(D>0)
{
printf("\nThe roots are true and distinct");
r1=(-b+sqrt((b*b)-(4*a*c)))/(2*a);
r2=(-b-sqrt((b*b)-(4*a*c)))/(2*a);
printf("\nThe root is %f", r1);
printf("\nThe root is %f", r2);
}
else if(D=0)
{
printf("\nThe roots are true and equal");
r1=(-b)/(2*a);
r2=(-b)/(2*a);
printf("\nThe root is %f", r1);
printf("\nThe root is %f", r2);
}
else
{
printf("The roots are not real");
}
return 0;
}
