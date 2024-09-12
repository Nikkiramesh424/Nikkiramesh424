import java.util.*;

class Bub
{
  static void bubbleSort(int array[])  
{
    int n = array.length;
    for (int i = 0; i < n - 1; i++)
    {
       for (int j = 0; j < n - i - 1; j++)
      { 
        if (array[j] > array[j + 1]) 
        {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
}
  public static void main(String args[])  
  
 {
    int array[]={24,78,96,54,87,9,7,6};
    System.out.println("Unsorted array:");
    {
      for(int i=0;i<array.length;i++)
      {
         System.out.println(array[i]+" ");
      }
      bubbleSort(array);
      System.out.println("Sorted array:");
      for(int i=0;i<array.length;i++)
      {
        System.out.println(array[i]+" ");
      }
    }
 }    
}   

OUTPUT: 
Unsorted array:
24 
78 
96 
54 
87 
9 
7 
6 
Sorted array:
6 
7 
9 
24 
54 
78 
87 
96 
   
