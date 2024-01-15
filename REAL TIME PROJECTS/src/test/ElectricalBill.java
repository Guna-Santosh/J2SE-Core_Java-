package test;
import java.util.*;
interface bill
{
    int billGenarationProcess(float unit);	
}
public class ElectricalBill 
{
	public static void main(String[] args) 
	{
		 ElectricalBill eb=new  ElectricalBill();
		 
		 bill ob=(float unit)->
		 { int amt=0;
			 if(unit>400)
			 {
				 amt=(int) (amt+(unit-400)*13);
			     unit=400;
			 }
			 if(unit>200)
			 {
				 amt=(int) (amt+(unit-200)*8);
			     unit=200;
			 }
			 if(unit>100) 
			 {
				 amt=(int) (amt+(unit-100));
			     unit=100;
			     
			 }
				 amt=(int) (amt+unit*4.3);
				 System.out.print("UR BILL = ");
			 return amt;
		     
		 };
		 Scanner s=new Scanner(System.in);
		 System.out.println("ENTER THE UNITS");
		  float unit=s.nextFloat();
		System.out.println( ob.billGenarationProcess(unit));
	
//		 System.out.println(eb.billGenarationProcess(unit));	
	}
}
