package CLASSASSIMENT;
import java.util.*;
class Employee
{
	int id,bsal,tsal;
	String name,jroll,mailid;
	long ph;
}
class ReadEmployee
{
	Employee RE(Scanner s) 
	{
		Employee e=new Employee();
		System.out.println("ENTER ID");
		e.id=s.nextInt();
		s.nextLine();
		System.out.println("ENTER NAME");
		e.name=s.nextLine();
		System.out.println("ENTER JROLL");
		e.jroll=s.nextLine();
		System.out.println("BASIC SALARY");
		e.bsal=s.nextInt();
		System.out.println("TOTAL SALARY");
		e.tsal=s.nextInt();
		s.nextLine();
		System.out.println("EMAIL-ID");
		e.mailid=s.nextLine();
		System.out.println("PHONE NUMBER");
		e.ph=s.nextLong();
		return e;
	}
}
class DisplayEmployee
{
	void dis(Employee e)
	{
		System.out.println("ID:"+e.id);
		System.out.println("NAME:"+e.name);
		System.out.println("JOB-ROLL:"+e.jroll);
		System.out.println("BASIC SALARY="+e.bsal);
		System.out.println("TOTAL SALARY="+e.tsal);
		System.out.println("EMAIL-ID"+e.mailid);
		System.out.println("PHONE NUMBER:"+e.ph);
	}
}
public class Empdetails 
{
   public static void main(String[] args)
   {
	 Scanner s=new Scanner(System.in);
	 ReadEmployee re=new ReadEmployee();
	 Employee e=re.RE(s);
	 DisplayEmployee d=new DisplayEmployee();
	 d.dis(e);	 
   }
}
