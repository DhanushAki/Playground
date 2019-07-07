#include<stdio.h>
int main()
{
  //fill the code
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i ;i <= n-1;i++)
    scanf("%d",&a[i]);
  int big = a[0];
  for(int i = 0;i<=n-1;i++)
  {
    if(a[i] >= big)
      big = a[i];
  }
  printf("%d",big);
  return 0;
}