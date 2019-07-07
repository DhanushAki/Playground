#include <stdio.h>
int main(){
	// Type your code here
  int n;
  scanf("%d",&n);
  int t = 0;
  for(int i = 1;i<=n; i++)
  {
    for(int j = 1;j<=i;j++)
    {
      if(t == 0)
      {
        printf("*");
        t = 1;
      }
      else
      {
        printf("#");
      t = 0;
      }
    }
    printf("\n");
  }
    return 0;
}