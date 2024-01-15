package HOSTALPROG;
import java.util.Scanner;
public class Folat1ex 
{
  /*void m1()
  {
	int a=(int)5.1;float b=5.6f; 
	
	System.out.println(a+b);
  }
	public static void main(String[] args) 
  {
	Scanner s=new Scanner(System.in);
	  int a;float b;
	  System.out.println("ENTER 2 NUMBERS");
	System.out.println("ENTER 1ST NUMBER");
	  int a1=s.nextInt();
	  System.out.println("ENTER 2ND NUMBER");
	float b1=s.nextFloat();
	System.out.println("1ST NUMBER="+a1);
	System.out.println("2ND NUMBER="+b1);
	System.out.println("SUM OF 2 NUMBERS="+(a1+b1));
	System.out.print("\nMETHOD SUM VALUE=");
		new Folat1ex().m1();
		}*/
	
	
	public static void main1(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a;float b=0.3f;
		System.out.print("enter the RAMU salary = ");
		int a1=s.nextInt();
		if(a1<1000) 
		{
			System.out.println("your sal = "+a1);
		}
		else if(a1>1000)
		{
			System.out.println("your sal = "+(a1+a1*b));
		}
		System.out.println("\n******************************");
		System.out.print("\nenter the SRINU salary = ");
		int a2=s.nextInt();
		if(a2<1000) 
		{
			System.out.println("your sal = "+a2);
		}
		else if(a2>1000)
		{
			System.out.println("your sal = "+(a2+a2*b));
		}
			
	}
  }

