package CF;
import java.util.*;
public class DemoArraylist 
{
	public static void main(String[] args) 
	{
     Scanner s=new Scanner(System.in);    
		int[] a = new int[5],b=new int[5];
	   for(int i=0;i<a.length;i++)	
	   {
		   a[i]=s.nextInt();
	   }
	   for(int i=0;i<a.length;i++)	
	   {
		   int rev=0,n=0;
		  while(a[i]!=0)
		  {
			   n=a[i]%10;
			   rev=rev*10+n;
			   a[i]=a[i]/10;
		  }
	     b[i]=rev;
	   }
		ArrayList<Integer> ai=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)	
		{
	         ai.add(b[i]);
		}
		
		System.out.println(ai);
	}

}
