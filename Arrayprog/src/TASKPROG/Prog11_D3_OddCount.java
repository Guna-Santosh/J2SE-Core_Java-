package TASKPROG;

import java.util.Scanner;

public class Prog11_D3_OddCount 
{
	String getOddCount(int[] a) 
	{  int c=0,e=0;
	   int len=a.length;
	  for(int i=0;i<a.length;i++)
	  {   if(a.length-1!=5)return "-1";
	       
	  
	  
	  
	     else {if(a[i]%2!=0) c++;}
	  } System.out.println(c);
	  return "";
	}
	
	
	
	
	
public static void main(String[] args) {
	System.out.print("a[i] size = ");
	Scanner s= new Scanner(System.in);
	int size=s.nextInt();
	int a[]=new int[size];
	for(int i=0;i<size;i++)
	a[i]=s.nextInt();
	Prog11_D3_OddCount pc=new Prog11_D3_OddCount();
	System.out.println(pc.getOddCount(a));
	
	
}
}
