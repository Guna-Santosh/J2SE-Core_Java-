package test;
import java.util.Scanner;
class Majority
{
   void findMajority(int a[]) 
   {
	   int mc=0,index=-1;
	   for(int i=0;i<a.length;i++) 
	   {
		   int c=0;
		   for(int j=0;j<a.length;j++) 
		   {
			   if(a[i]==a[j]) 
			   {
				   c++;
			   }//if
		   }//inner for
		   if(c>mc) 
	       {
		    mc=c;
		    index=i;
	       }   
   }//outer for
   if(mc>a.length/2) 
   {
	System.out.println(""+a[index]);
   }
	else 
	{ System.out.println("no maj ele");
	}
   }
}//
public class Majority_Ele 
{
    public static void main(String[] args) 
	{
	    int a[]= {2,2,1,2,5,8,5,9};
		Majority m=new Majority();
		m.findMajority(a);
	}
}
