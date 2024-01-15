package pistring;

import java.util.Scanner;

public class BracketsRemoving {
	public static void main(String[] args) 
	{
		
       System.out.println(" enter the String ");
       Scanner s=new Scanner(System.in);
       try(s){
       String s1=s.nextLine();
       System.out.println(s1);  
       System.out.println(s1.replaceAll("[(){}]", ""));
       }
       
	}
}
