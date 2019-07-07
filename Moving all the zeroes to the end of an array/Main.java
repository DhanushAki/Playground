#include<stdio.h>
int main()
{
  //Type your code here
  int n,count = 0;
  scanf("%d",&n);
  int a[n];
  for(int i = 0;i<n;i++)
    scanf("%d",&a[i]);
  
  for(int i = 0;i<n;i++)
  {
    if(a[i]!=0)
    {
      a[count++] = a[i];
    }
  }
while(count < n)
  a[count++]  = 0;
  
  for(int k = 0;k<n;k++)
    printf("%d ",a[k]);
  return 0;
}