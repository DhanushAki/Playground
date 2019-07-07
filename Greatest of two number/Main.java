#include<stdio.h>
int main()
{
  int a,b;
  scanf("%d%d",&a,&b);
  if(a!=b)
  {
  if(a>b)
    printf("num1 is the greatest\n");
  else  
    printf("num2 is the greatest\n");
  }
  else 
    printf("Both number Equal\n");
  return 0;
}