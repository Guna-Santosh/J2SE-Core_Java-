package Timepass_s;
import java.util.Scanner;
import java.util.StringTokenizer;
public class SentanceReverse {
	public static void main(String[] args)
	{
	 @SuppressWarnings("resource")
	String s1=new Scanner(System.in).nextLine(),s2="",s3="";
	 StringTokenizer tokob=new StringTokenizer(s1);
	 while (tokob.hasMoreElements()) 
	  {
		s2=" "+tokob.nextToken()+""+s2;	
		s3=s2;		
	  }
	 System.out.println(s2);
//	 System.out.println(new StringBuffer(s3).reverse());		
}
}
