package Timepass_s;

import java.util.Scanner;

public class Pro2_arrString 
{

	public static void main(String[] args) 
	{
	  Scanner s=new Scanner(System.in);
      String arr[]=new String[4];
     
      System.out.println("enter sentance = ");
      for(int i=0;i<arr.length;i++) 
        arr[i]=s.nextLine();
     System.out.println(arr[0].hashCode());
     System.out.println(arr[3].hashCode());
     
      System.out.println(arr[0]==(arr[3]));
	//System.out.println(arr[0].equals(arr[3]));
	
	
	System.out.println("-------integer array------- ");
	
	int a[]=new int[4];
	System.out.println("enter the elements");
	for(int i=0;i<a.length;i++)
	a[i]=s.nextInt();
	System.out.println(a.hashCode());
	System.out.println(a[0]);
	System.out.println(a[3]);
	System.out.println(a[0]==a[3]);
	
	}

}
//   System.out.println(arr[0].hashCode());
//System.out.println(arr[3].hashCode());