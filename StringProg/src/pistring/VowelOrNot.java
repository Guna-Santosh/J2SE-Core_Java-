package pistring;
import java.util.Scanner;
public class VowelOrNot 
{
  public static void main(String[] args) 
  {
   System.out.print("enter the character:");
   Scanner s=new Scanner(System.in);
   char ch=s.next().charAt(0);
   if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') 
   {
       if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
    	  ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
    	   System.out.println("vowles");
       else
    	   System.out.println("consonents");
   }
   else
	   System.out.println("not a character");
s.close();
  }
}
