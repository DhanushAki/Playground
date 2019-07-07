#include<stdio.h>

int sq(int m)
{
  return (m*m); 
}
int main() {
   // Type your code here
  int n;
  scanf("%d",&n);
  int square = sq(n);
  printf("%d",square);
   return 0;
}