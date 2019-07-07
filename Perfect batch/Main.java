
#include<stdio.h>
int main()
{
  //Type your code here
 int n;
  scanf("%d",&n);
    int a[n],sum = 0,add = 0;
  for(int i = 0;i<n;i++)
  {  scanf("%d",&a[i]);}
	
  for( int j =0;j<(n/2);j++ )
  {sum = sum + a[j];}
   for( int k =(n/2);k<n;k++ )
   {add = add + a[k];}
  
  if(sum == add)
  {   printf("Perfect Batch\n");}
  else
   { printf("Not a Perfect Batch\n");}
  
  return 0;
}