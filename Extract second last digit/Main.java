#include<stdio.h>
int main()
{
  long n;
  //Type your code here
  scanf("%d",&n);
  long a = (n%100);
  long ans = (a/10);
  printf("%d",ans);
  return 0;
}