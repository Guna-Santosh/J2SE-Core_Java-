package Labpdf1;

import java.util.Scanner;

public class Prog64_Hello_Lolo 
{
	
	String countCharacter(String s1,int n) 
	{   String str3=""; 
	    String str2=s1.substring(s1.length()-n);
	    for(int i=0;i<n;i++) 
	    {   str3+=str2;  }
	  return str3.substring(0,1).toUpperCase()+
		     str3.substring(1,str3.length());
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);System.out.print("enter number = ");
		int n=s.nextInt();
		Prog64_Hello_Lolo sp=null;
		sp=new Prog64_Hello_Lolo();
		
		System.out.println(sp.countCharacter("hello", n));
	     sp=null;
	}

}
//str2.substring(str2.length()-n,str2.length()-1).toUpperCase();
