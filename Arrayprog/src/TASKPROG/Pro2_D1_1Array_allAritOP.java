/*Que-2)
__________________
 Develop a program to take multiple integer as parameter as
 arguments in a method(in array format) by taking input from 
 the user.Inside this method 
 add and subtract and multiply all the passed integer 
 value and return addition,Subtraction 
 and multiplication from calling method and display 
 all the value from the main method.
 method name:ArrayCalculation()
 method type :int [] array 
 return type: int [] array 

Note: Also pass 0 as size at the time giving size of the array and 
then observe the output.
      //if any execption will be there then write the logic to solving that exception.
*/package TASKPROG;
import java.util.Scanner;
public class Pro2_D1_1Array_allAritOP 
{public static int[] add(int arr[])
  {int sum=0,multi=1,sub=0;
	 int ar[]=new int[arr.length];
	 for(int i=0;i<arr.length;i++)
	 {sum+=arr[i];multi*=arr[i];sub=sub-arr[i];}
	   ar[0]=sum;ar[1]=multi;ar[2]=sub;
	return ar;}
  public static void main(String[] args) 
	{Scanner s=new Scanner(System.in);
	   System.out.print("Enter Array Size = ");
	   int size=s.nextInt();int arr[]=new int[size];
	   System.out.print("Enter Array Elements = ");
	   for(int i=0;i<arr.length;i++)
	   {arr[i]=s.nextInt();} 
	   int arr1[ ]=Pro2_D1_1Array_allAritOP.add(arr);
	   for(int i=0;i<3;i++)
	   {System.out.println(arr1[i]);}s.close();
    }
}
