package pistring;

import java.util.Scanner;

public class RemoveVowles {
	public static void main(String[] args) {
		System.out.print("enter the value:");
		Scanner s=new Scanner(System.in);
		try(s){
		String s1=s.nextLine().toLowerCase();
		char ch[]=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
		 if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
		    	   continue;
			 System.out.print(ch[i]);
		}
		
		}
	}

}
