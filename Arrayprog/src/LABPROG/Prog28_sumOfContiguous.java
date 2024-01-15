/*Program-28

Implement a Program to Find the Sum of Contiguous Subarray within
 a 1 – D Array of Numbers which has the Largest Sum 
-----------------------------------------------
Sample Input
Enter array size
8
Enter 8 elements
10  -2   15  9  -8  12  20  -5
Sample Output
The max sum is 56 
The begin and End are 0 & 6
------------------------------------------------
Case1:
Enter array size
5
Enter 5 elements
10  20  30  40   50
The maximum sum is 150
The begin and End are 0 & 4
------------------------------------------------
Case2:
Enter array size
5
Enter 5 elements
1  2  3  4  5
The maximum sum is 15
The begin and End are 0 & 4*/
package LABPROG;
import java.util.Scanner;
public class Prog28_sumOfContiguous 
{
      @SuppressWarnings("removal")
	void largestsum(Integer arr[], Scanner s) 
      {     int i,sum=0;
    	  for(i=0;i<arr.length;i++) 
    	  {System.out.print("a["+i+"] = ");
    	  arr[i]=new Integer(s.nextInt());
    	  if(0<arr[i]) 
    	  {
    		  sum=sum+arr[i];
    	  }
    	  }//end of for loop
    	  System.out.println("The maximum sum is = "+sum);
      } //end of largestsum()
	public static void main(String[] args) 
 {      System.out.print("ENTER SIZE = ");
	    Scanner s=new Scanner(System.in);
		Prog28_sumOfContiguous sOc=new Prog28_sumOfContiguous();
		int size =s.nextInt();
	    Integer arr[]=new Integer[size];
	    sOc.largestsum(arr, s);
}//end of main()
}//end of class
//System.out.print("a["+i+"] = ");