#include<stdio.h>
int main()
{
  //Type your code here
  int n,el1,el2,flag = 0;
  scanf("%d",&n);
  int a[n];
  for(int i = 0;i<=n-1;i++)
    scanf("%d",&a[i]);
  scanf("%d%d",&el1,&el2);
  
   for(int i = 0;i<=n-1;i++)
  {
    if((a[i]) != el1)
      //printf("%d \n",i);
      flag = 1;
    else
    {
      printf("%d \n",i);
      flag = 0;
      break;
    }
  }
  if(flag == 1)
    printf("-1");
  
  for(int i = 0;i<=n-1;i++)
  {
    if((a[i]) != el2)
      //printf("%d \n",i);
      flag = 1;
    else
    {
      printf("%d \n",i);
      flag = 0;
      break;
    }
  }
  if(flag == 1)
    printf("-1");

  return 0;
}