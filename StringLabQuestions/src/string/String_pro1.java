/*
Program-51

Create a class containing a method to 
create the mirror image of a String. 
The method should return the two Strings 
separated with a pipe(|) symbol .

Method Name 	getImage 
Argument        String 
Return Type 	String 
For Example 
	Input : EARTH 
Output : EARTH|HTRAE */
package string;

public class String_pro1 
{
   String getImage(String name) 
   {
	   System.out.print(name);
	   System.out.print(" | ");
	   int le=name.length();
	   for(int i=le-1;i>=0;i--) 
	   {
		   char ch=name.charAt(i);
	       System.out.print(ch);  
	   }
	  return "";
   }
	public static void main(String[] args)
	{
      java.util.Scanner s=new java.util.Scanner(System.in);
      System.out.println("ENETR THE STRING");
      String NAME =s.nextLine();
      String_pro1 gi =new String_pro1();
      gi.getImage(NAME);
      s.close();
	}

}
