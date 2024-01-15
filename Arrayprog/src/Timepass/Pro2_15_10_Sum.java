package Timepass;import java.util.Scanner;
public class Pro2_15_10_Sum 
{
    public static void main(String[] args) 
    {
	   System.out.print("a[i] size = ");
       Scanner s=new Scanner(System.in);
       int size =s.nextInt();
       Integer[] a=new Integer[size];
       for(int i=0;i<size;i++)
    	   a[i]=s.nextInt();
    	for(int i=0;i<a.length;i++) 
    	{
    		for(int j=0;j<a.length;j++) 
    		{
    			for(int k=0;k<a.length;k++)
    				if(a[i]+a[j]+a[k]==18)
    	System.out.println("("+a[i]+","+a[j]+","+a[k]+")");
    		}
    	}
    }
}//end of class
// input : 4,5,9,2,12 		output:[4,5,9] [4,2,12] 