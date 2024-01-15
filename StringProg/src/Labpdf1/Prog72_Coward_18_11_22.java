package Labpdf1;
import java.util.Scanner;
public class Prog72_Coward_18_11_22 
{
	String coward(String s1, int n) 
	{
		String s2="";
		for(int i=0;i<n;i++) 
		{
	     if(n>=4)
	       s2+=s1.substring(0,3);
	     else 
	       s2+=s1.substring(0,n);
		}
		return s2;
	}
	public static void main(String[] args) 
	{
        Scanner s=new Scanner(System.in);
        String s1=s.next();
  	    int n=s.nextInt();
		Prog72_Coward_18_11_22 ob=new Prog72_Coward_18_11_22 ();
		System.out.println(ob.coward(s1,n));
	    s.close();
	}
}