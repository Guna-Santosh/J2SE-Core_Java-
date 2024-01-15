package Timepass;
import java.util.Arrays;
@SuppressWarnings("unused")
public class Basicpro1 
{
  public static void main(String[] args) 
  {
	java.util.Scanner s=new java.util.Scanner(System.in);
	System.out.print("ENTER THE SIZE OF ARRAY = ");
	int size=s.nextInt();
	System.out.print("enter "+size+" elements\n");
	
	
	Integer arr[]=new Integer[size];
	for(int i=0;i<arr.length;i++)
	{
		System.out.print("a["+i+"] = ");
	arr[i]=s.nextInt();
	}
	System.out.print("ELEMENTS = ");
    for(Integer z:arr) 
    {
    	System.out.print(z+" ");
    }
    
	
	s.close();
  }
}
