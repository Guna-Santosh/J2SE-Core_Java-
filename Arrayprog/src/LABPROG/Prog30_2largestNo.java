/*Program-30

FRUIT YIELDING TREE
Fruit yielding tree
Raju owned a farm which had ‘n’ fruit trees.
He sold a tree from the farm which yielded the utmost number of fruits.
Now, he wanted to seek out the tree that yielded the 
second maximum number of fruits.
Write a program to assist Raju find 
the second largest fruit yielding tree without sorting.

Function Specification: int secondLargest(int *, int);

Input format:

The first line of the input corresponds to the n.

The next n inputs correspond to the number of fruits yielded by each tree.
(Assume number of fruits yielded by each tree is unique)

 
Output format:

The output is an integer which corresponds to 
the second largest fruit yielding tree from the farm.

Sample Input:
7
7
5
8
6
9
4
3
Sample Output:
8
*/package LABPROG;
import java.util.Scanner;
public class Prog30_2largestNo
{
	@SuppressWarnings("removal")
	String secondLargest() 
	{
		int sl; int max=0;int secondmax=0;
	    System.out.print("ENTER SIZE = ");
	    Scanner s=new Scanner(System.in);
	    int size =s.nextInt();
	    Integer arr[]=new Integer[size];
	    for(int i=0;i<arr.length;i++) 
	    {    System.out.print("a["+i+"] = ");
	    	arr[i]=new Integer(s.nextInt());
	    	if(max<arr[i]) 
	    	{
	    		secondmax=max;
	    		max=arr[i];
	    	}//end of if
	    	else if(max!=arr[i]&&secondmax<arr[i]) 
	    	{
	    		secondmax=arr[i];
	    	}//end of else
	    }//end of for loop	//System.out.println(secondmax);
	    sl=secondmax;
		return sl+" IS 2ND LARGEST FRUIT IN YEILD...";
	}//end of secondlargest()
	public static void main(String[] args) 
	{
		 Prog30_2largestNo sl=new   Prog30_2largestNo();
				 System.out.println(sl.secondLargest()); 
	
	
	
	}//end of main()
}//end of class.
