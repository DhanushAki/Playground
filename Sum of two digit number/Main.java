#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int a = (n/10);
  int b = (n%10);
  int sum = a+b;
  printf("%d",sum);
  return 0;
}