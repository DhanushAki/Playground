#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
 int count = 1;
  for(int i = 0;count<=n;i++)
  {
    if((i%2)!=0)
    {
      printf("%d\n",i);
    	count++;
    }
  }
	return 0;
}