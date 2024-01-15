package stringdemo1;
public class Pro1 
{
  public static void main(String[] args) 
	{
System.out.println("====this program is adding 1 letter  given string====");
       System.out.print("ENTER THE STRING: ");
       java.util.Scanner s=new java.util.Scanner(System.in);
     	   String a=s.nextLine();//scanf of a
	   int ln=a.length();//finding length of given string
	   for(int i=0;i<=ln-1;i++) 
	   {
		   char ch=a.charAt(i); 
		   if(ch==ch) 
		   {
			  ch++;
		   }//end of if 
		   System.out.print(ch);
	   }//end of 1st for loop
	   s.close();
	}//end of main
}//end of class
