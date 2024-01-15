/*Que-14)
_____________
Write code for calculating row-wise sum of array of size 3 X 3

Define the following method

Name of Method	: getRowSum() // accepts 2-D array and return 1-D array contains row-wise sum 
Argument		: int[][]
Return type		: int[]

Input: array has the following elements

1 2 3
1 2 3
1 2 3 

Output: array should contain following elements

6 6 6

Method should meet the following functional expectations

1. Method should take only 3 X 3 array and should return one-dimension 
   array contains row-wise sum.
2. Return null, If array size is not 3 X 3.
3. Return null, If input is null.
*/package TASKPROG;

import java.util.Scanner;

public class Prog14_D4_RowSwmIn2D_Arry {
	int[] getRowSum(int[][] a) 
	{
		int k[]=new int[a.length];
	for(int i=0;i<a.length;i++) 
    {   
       for(int j=0;j<a.length;j++)	
       {
	      k[j]=k[j]+a[i][i];
       }
    }
	for(int i=0;i<k.length;i++)
	System.out.print(k[i]+" ");
	
	return k;
	}
public static void main(String[] args) 
  {
	Prog14_D4_RowSwmIn2D_Arry rs=new Prog14_D4_RowSwmIn2D_Arry();
	Scanner s=new Scanner(System.in);
	int size1=s.nextInt();int size2=s.nextInt();
	int a[][]=new int[size1][size2];
	if(size1!=size2) {System.out.println("null");}
		   for(int i=0;i<a.length;i++) 
	       {   
	          for(int j=0;j<a.length;j++)	
	          {
		       a[i][j]=s.nextInt();
	          }
	       }
		   System.out.println(rs.getRowSum(a));
   }
}
