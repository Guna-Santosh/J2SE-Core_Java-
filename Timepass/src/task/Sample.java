package task;
import java.lang.reflect.Method;
@SuppressWarnings("unused")
class Sap
{
    private void m1(){System.out.println("i am private method, I am hacked ");}	
            void m2(){ System.out.println("i am public method");}
}
//---------------------------------------------------------------------------------
public class Sample
{
	public static void main(String[] args) throws Exception
	{
		Sap ob=new Sap();		//ob.m2();
//----------------reflect class support-------------------------------------------		
		Method m=Sap.class.getDeclaredMethod("m1");
		m.setAccessible(true);
		m.invoke(ob);
	}
}