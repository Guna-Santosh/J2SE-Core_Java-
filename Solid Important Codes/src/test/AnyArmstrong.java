package test;
public class AnyArmstrong 
{
	  public static void main(String[] args) 
	  {   int m,k,su=0,c=0;

	   System.out.println("FINDING ANY DIGIT NUMBER ARMSTRONG");
		System.out.print("ENTER NUMBER = ");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int n=s.nextInt();	
		//int num=String.valueOf(n).length();
		while(n!=0) //counting the given number
		{
			n=n/10;//SEPERATING SINGLE NUMBERS
			c++;//COUNTING EACH NUMBER 
		}//end of while loop
		for(int i=1;i<c;i++)//LOOP WILL WORK UPTO COUNTING NUMBER 
		{
			m=1;
			k=n%10;
		for(int j=1;j<c;j++)
		{
			m=m*k;}
		    su=su+k;
		    n=n/10;
		}//end of 1st for loop
		if(n==su)//SUM & GIVEN NUMBER IS EQUAL 
			System.out.println("amstrong");
		else
			System.out.println("not amstrong");
		s.close();
	  }//end of main 
	}//end of class
	//4210818,548834,54748,6474,153,9
