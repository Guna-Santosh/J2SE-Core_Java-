package PavanQuestion;
import java.util.Scanner;
public class Timepass 
{  int a=10;;
   public static void main(String[] args) 
   {
	/*float a=10;
	byte b=20;
	System.out.println(a+b);*/
	/*short a=10;
	long b=20;
	System.out.println(a+b);*/
	   Scanner s=new Scanner(System.in);
	   Integer z=19;//boxing
	   int k=Integer.valueOf(z);//unboxing
	  // int k=Integer.valueOf(z).length (error)
	   System.out.println(k);
	   
	   int k1=143;
	   int b=String.valueOf(k1).length(); 
	   System.out.println(b);
	 //converting int to string bcz of length() is there in string;
	   
	   
	   int c=String.valueOf(1528).length();
	   System.out.println(c);
	   //finding length of number using wapper class 
	   //                     boxing unboxing it is possible
}
}
