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
package Labpdf1;

public class Prog51_EarthMirror 
{
   String getImage(String name) 
   {   System.out.println("-----process-1----------------");
	  // String s1=name;
	   StringBuffer sb=new StringBuffer(name);
	   System.out.println(name+" | "+sb.reverse());
	   System.out.println("------process-2----------------");
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
      Prog51_EarthMirror gi =new Prog51_EarthMirror();
      gi.getImage(NAME);
      s.close();
	}

}
