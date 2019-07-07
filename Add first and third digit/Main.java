#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int f = n/100;
  int l = n%100;
  int lst = l%10;
  int sum = (f+lst);
  printf("%d",sum);
  return 0;
}