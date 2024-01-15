package test;
import java.util.Scanner;
@SuppressWarnings("serial")
public class Mainclass extends Exception 
{
    public Mainclass(String msg) 
    {
    	super(msg);
    }
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
		System.out.print("enter the password : ");
	    String password=s.next();
	    int le=password.length();
	try 
	{
		if(le<8)
		{  
			Mainclass mc =new Mainclass("enter min 8 chars..");
		    throw(mc);
		}
		COJ_19_Validotar vd=new COJ_19_Validotar();
		vd.validationPassword(password);
		if(vd.validationPassword(password)==false)
		{
			Mainclass mc =new Mainclass("invaild password...");
		    throw(mc);	
		}
		System.out.println("access to login...");
	}
	catch(Mainclass mc)
	{
		System.out.println(mc.getMessage());
	}
	finally
	{
		s.close();
	}
    }
}
