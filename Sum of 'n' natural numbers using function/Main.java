#include<stdio.h>
int add(int m)
{
  int summ = 0;
  while(m>=1)
  {
	summ+=m;
    m--;
  }
  return summ;
}
int main() 
{
    // Type your code here
  int n;
  scanf("%d",&n);
  int sum = add(n);
  printf("%d",sum);
  	return 0;
}