#include <stdio.h>
// Main function
int main()
{
  int n,large;
  scanf("%d",&n);
  int a[n];
  for(int i = 0;i<=n;i++)
    scanf("%d",&a[i]);
  int big = a[0];
  for(int j = 0;j<=n;j++)
  {
  	if(a[j] >= big)
      big = a[j];
    	large = j-1;
  }
  printf("%d",large);
  
  // Type your code here 
  
   return 0;
}