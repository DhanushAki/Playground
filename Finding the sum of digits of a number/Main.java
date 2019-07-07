#include <stdio.h>
int main() {
	//Type your code
  int n,sum = 0;
  scanf("%d",&n);
  while (n!=0)
  {
    sum += n%10;
    n = n/10;
    //sum+=sum;
  }
  printf("%d\n",sum);
    
	return 0;
}