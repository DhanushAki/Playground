#include<stdio.h>
#include<stdlib.h>
void check_sum_and_display(int arr[], int size, int sum,int flag);
int main()
{
    // Get the size of an array
     int size,flag = 0;
    scanf("%d", &size);
    
    // Get the array elements
    int arr[50], i;
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }
    
    // Get the sum value (to check with an array elements)
    int sum;
    scanf("%d", &sum);
    
  	// Function call to check the sum of any two elements in an array equal to given sum 
  	// and display the same
    check_sum_and_display(arr, size, sum,flag);
    return 0;
}

void check_sum_and_display(int arr[], int size, int sum,int flag)
{
  // Type your code here
  int add;
  for(int i = 0;i<size;i++)
  {
    for(int j = i+1;j<size;j++)
    {
      if(arr[i]+arr[j] == sum)
      {  flag = 1;
      printf("Perfect couple: %d %d\n",arr[i],arr[j]);
      }
    }
    
    }
 if(flag == 0)
  printf("No perfect couple found!\n");
       
    
}