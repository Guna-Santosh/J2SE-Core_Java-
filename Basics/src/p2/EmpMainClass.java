package p2;
import p1.CalculateSalary;
public class EmpMainClass 
{
   public static void main(String[] args)
   {
	 java.util.Scanner s=new java.util.Scanner(System.in);
	   System.out.println("ENTER THE BSAL");
	int bsal=s.nextInt();
	if(bsal>=12000)
	{
		CalculateSalary cs=new CalculateSalary();
        float totsal=cs.calculate(bsal);	
	System.out.println("TOTAL SAL = "+totsal);
	}//end of if
	else
	{
		System.out.println("invalid bsal");
	}//end of else
	
   }//end of main

}//end of class
