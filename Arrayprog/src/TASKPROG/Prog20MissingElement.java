package TASKPROG;

import java.util.*;
public class Prog20MissingElement 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("a[size] = ");
		int n=s.nextInt();
	     int[]a =new int[n];
	     System.out.print("a["+a.length+"] = ");
	     for(int i=0;i<n;i++) 
	     {
	    	 a[i]=s.nextInt();
	     }
	     Arrays.sort(a);
//	     for(int i=a[0]+1;i<a[n-1];i++) 
	    	 for(int i=a[0];i<=a[n-1];i++) 
	     {
	    	 boolean k=true;
	    	 for(int j:a) 
	    	 if(j==i) k=false;
	    	 if(k)   
	    			 System.out.print(i+" "); 
	     }    
	}
}