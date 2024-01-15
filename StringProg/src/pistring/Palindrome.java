package pistring;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.print("enter the value:");
		Scanner s=new Scanner(System.in);
		try(s){
		String s1=s.nextLine().toLowerCase();
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
		 s2=s1.charAt(i)+s2;
		}
		//System.out.println(s2);
		if(s1.equals(s2))
			System.out.println("palomdrome");
		else
			System.out.println("not a palomdrome");
	
		
		}
	}

}
