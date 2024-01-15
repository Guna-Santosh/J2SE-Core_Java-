/*Program-27

MAXIMUM DIFFERENCE
Given an array of integers, find out the maximum difference among any two integers 
such that larger integer appears after the smaller ineteger in an array.
Examples:
If array is [1,5,56,89,25,41,33,55] then returned value should be 88 (Diff between 89 and 1).
If array is [10,30,50,70,110,90] then returned value should be 100 (Diff between 10 and 110)

Input and Output Format:
The first line of the input consists of an integer, n that corresponds to the number of elements in the input array.
The next 'n' lines in the input correspond to the elements in the array.
Output is an integer.
------------------------------------------------------
Sample Input1: 5
1  2  90  10  110    max=110  min=1 max-min=109
Sample Output1:
109
------------------------------------------------------
case-1.
Enter number of elements
7
Enter 7 elements
2  3  10  6  4  8  1
Difference between maximum and minimum value is 8  
-------------------------------------------------------
case-2.
Enter number of elements
6
Enter 6 elements
10  20  30  40  50  6
Difference between maximum and minimum value is 40
--------------------------------------------------------
case-3.
Enter number of elements
5
Enter 5 elements
10  20  30  40  50
Difference between maximum and minimum value is 40
*/package LABPROG;
import java.util.Scanner;
public class Prog27_Max_diff_min {
public static void main(String[] args) 
	{    
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter size");
	     int size=s.nextInt();
	     int a[]=new int[size];
	     for(int i=0;i<size;i++) 
	   	 a[i]=s.nextInt();
           // for(int i=0;i<size;i++) System.out.println(a[i]); 
            int max=a[0];int min=a[0];
            for(int i=0;i<size;i++)
            {
            	if(a[i]>max)max=a[i];
                if(a[i]<min)min=a[i];
            
            }
            System.out.println("max = "+max+" "+",min = "+min+"\ndifferent"+(max-min));
            	
            	
            s.close();
            
	}//end of main()
}//end of class
