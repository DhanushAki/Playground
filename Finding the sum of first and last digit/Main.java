#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int last = n%10;
  int first = n;
  while (first>=10)
  {
    first = first/10;
  }
  int sum = first + last;
  printf("%d\n",sum);
	return 0;
}