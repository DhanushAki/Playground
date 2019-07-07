#include <stdio.h>
int main() {
	//Type your code
  int n;
  int fact=1;
  scanf("%d",&n);
  if(n>0)
  {
  for(int i = 1;i<=n;i++)
  {
    fact *= i; 
  }
    printf("%d\n",fact);
  }
	return 0;
}