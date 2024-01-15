package pistring;
import java.util.*;
public class RemoveSpaces {
	public static void main(String[] args) 
	{
		System.out.println("entre the requirement");
     Scanner s=new Scanner(System.in);
     try(s){
     String s1=s.nextLine();
     
     System.out.println("before removing spaces\n"+s1);
     System.err.println("after removing spaces");
     for(int i=0;i<s1.length();i++) 
     {
    	 if(s1.charAt(i)==32)continue;
//    	 if(s1.charAt(i)==' ')continue;
    	 System.out.print(s1.charAt(i));
     }
	}}

}
