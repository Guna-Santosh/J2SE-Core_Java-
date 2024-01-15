package maccess;
import test.Contact;
import test.Customer;
import test.ReadInpute;
import test.DisplayOutput;
import java.util.Scanner;
public class DemoRef1 
{
	public static void main(String[] args) 
	{
		  DemoRef1 dr=new DemoRef1();
	    Contact ob1=new Contact();
     Customer ob2 = new Customer(ob1);
          Scanner s=new Scanner(System.in);
      ReadInpute ri=new ReadInpute();      ri.read(s,ob2);
  DisplayOutput ro=new DisplayOutput();  ro.dis(ob2);
	s.close();
	}
}
