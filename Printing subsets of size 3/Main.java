#include<stdio.h>
// sub(int x,int *a[x]
int main()
{
  //Type your code here
  int n;
  int a[n];
  scanf("%d",&n);
    for(int i =0;i<n;i++)
    scanf("%d",&a[i]);
  
  for(int i = 0;i<=n-2;i++)
  {
    for(int j = i+1;j<=n-1;j++)
    {
      for(int k = j+1;k<=n-1;k++)
      {
        printf("(""%d"","" ""%d"","" ""%d"")"" ",a[i],a[j],a[k]);
      }
      
    }
    printf("\n");
  }
  return 0;
}