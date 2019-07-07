#include <stdio.h>
int main() {
	//Type your code
  long n;
  scanf("%d",&n);
  long sec = n;
  while(sec>=100)
  {
     sec = sec/10;
  }
  long ans = sec%10;
  printf("%d",ans);
	return 0;
}