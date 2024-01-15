/*Que-1)
_________________
  WAJP for 1D array inside that array take few elements for eg.(1,2,3,4,5)
  create a method name elementAddition() having 1 parameter 
  as int Array which will return the sum of all the element*/
package TASKPROG;import java.util.Scanner;
public class Pro1_D1_SumArr 
{
    int elementAddition(int a[]) 
    { 
     int sum=0;
    
     
     
    	for(int i=0;i<a.length;i++) 
    	{
    		sum=sum+a[i];
    	}
    	return sum;
    }
    public static void main(String[] args) 
     {Scanner s=new Scanner(System.in);
        int size=s.nextInt();
    	
        int a[]=new int[size];
        for(int i=0;i<a.length;i++) 
        {
       	a[i]=s.nextInt();
        }
        Pro1_D1_SumArr p1=new Pro1_D1_SumArr();
	    System.out.println(p1.elementAddition(a));
   }
}
