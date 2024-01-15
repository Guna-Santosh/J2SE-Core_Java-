package test;
public class Boss 
{
	public static void main(String[] args) 
	{
   	   OuterClass oc=new OuterClass();
   	   oc.m1();
   	   OuterClass.m11();//(or) oc.m1();
   	   OuterClass.InnerCLass ic=oc.new InnerCLass();
   	   //
   	   ic.m22();
   	   ic.m2();
	}

}
