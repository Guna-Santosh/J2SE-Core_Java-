package test;
import test.*;
public class maccess {
	public static void main(String[] args) {

		SubClass1 sc1=new SubClass1();
		SubClass1.SubClass2 sc2 =sc1.new SubClass2();
		sc1.m1();
		sc2.m2();
		sc2.m22();
		
		
	}//end of main()
}//end of class
