/*Program-31

Write a program to Calculate Sum of all integers of an 
Array using Arguments 
Function specification: int arraysum(int *ptr, int num)
Note:
Refer function specifications for the function details.
int arraysum(int*,int); // for c and c++
int arraysum(int[],int) // for java.

Input format:
The first line of the input corresponds to the number.
The next number inputs correspond to the sum of all integers
Output format:
The output is an calculate sum of all elements in a array.
Constraint:
This Program calculate sum of all integers of an array using arguments.
The program calls a function/method to 
add the addition and passes the array argument.

Sample Input:
5
200 400 600 800 1000
Sample Output:
3000

Case1:
Enter number of elements
2
Enter 2 numbers: 
10
20
Sum of all array elements = 30

Case2:
Enter number of elements
1
Enter 1 numbers: 
10
Sum of all array elements = 10
*/
package LABPROG;
import java.util.Scanner;
public class Prog31_SumofArr 
{
	@SuppressWarnings("removal")
	int sumOfArray()
	{ int k=0;
	   Scanner s=new Scanner(System.in);
	   System.out.print("ENTER SIZE = ");
	   int size= s.nextInt();
	   Integer arr[]=new Integer[size];
	   for(int i=0;i<arr.length;i++)
	   {
		   System.out.print("a["+i+"] = ");
		   arr[i]=new Integer(s.nextInt()); 
		  k=k+arr[i];s.close();
	   }//end of for
	   return k;
	}//end of sumofarr()
	public static void main(String[] args) {
		Prog31_SumofArr sa=new Prog31_SumofArr();
		System.out.println(sa.sumOfArray());
	}//end of main()

}//end of class
