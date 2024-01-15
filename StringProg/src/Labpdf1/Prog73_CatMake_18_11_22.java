package Labpdf1;

import java.util.Scanner;

public class Prog73_CatMake_18_11_22
{
	String lastChar(String[]s1 ) 
	{
		String s2="";
		for(int i=0;i<s1.length;i++)
		s2=s2+s1[i].substring(s1[i].length()-1);
		return s2;
	}
	public static void main(String[] args) 
	{
		Prog73_CatMake_18_11_22 ob= new Prog73_CatMake_18_11_22();
		Scanner s=new Scanner(System.in);
		System.out.print("s1[] size = ");
		int size=s.nextInt();
		String s1[]=new String[size];
		for(int i=0;i<s1.length;i++) 
		{
		  s1[i]=s.next();
		}
        System.out.println(ob.lastChar(s1));
        s.close();
	}
}
		


//System.out.println(s1[i].substring(s1[i].length()-1));