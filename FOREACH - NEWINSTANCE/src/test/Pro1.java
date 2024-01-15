package test;
public class Pro1 
{
    @SuppressWarnings({ "deprecation","rawtypes" })
	public static void main(String[] args) 
	 throws ClassNotFoundException, InstantiationException, IllegalAccessException 
	{
     Class c=Class.forName("test.Display"); //ClassNotFoundException
     test.Display ob=(test.Display)c.newInstance();//InstantiationException, IllegalAccessException
         ob.m();
	}
}
