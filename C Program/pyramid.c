#include<stdio.h> 
 int main()
 {
  int i,j,n,b;
  
  scanf("%d",&n);
 b=2*n-1;
     if(n<0)
     {printf("ERROR");}
     else{
  for(i=n;i>0;i--)
  {
    for(j=b;j>=0;j--)
    {        
                 
 if(j>=n-(i-1) && j <= n+(i-1))
     
{

  printf("* ");
}

      
else 
{ 
 printf("  ");}
}
  printf("\n");
}
     }
  return 0;
  }
