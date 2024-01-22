package test;

public class Boss {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		oc.m1();
		OuterClass.InnerClass ic = new OuterClass.InnerClass();
		ic.m1();
		ic.m11();
	}

}
