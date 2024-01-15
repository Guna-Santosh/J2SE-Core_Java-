package test;

public class Pro1_04_11_22 
{
	String m1(String s1, String s2) 
	{   
		String s3="";
		System.out.println(s1.length()+s2.length());
		if(s1.length()>s2.length())
			s3=s1.substring(0,1).toUpperCase()+s1.substring(1,s1.length())+
			   s2.substring(0,1).toUpperCase()+s1.substring(1,s1.length());
		else
			s3="no";
		return s3;
	}
	public static void m(String[] args) 
	{
		Pro1_04_11_22 sp=new Pro1_04_11_22();
		System.out.println(sp.m1("hello", "java"));
	}

}
