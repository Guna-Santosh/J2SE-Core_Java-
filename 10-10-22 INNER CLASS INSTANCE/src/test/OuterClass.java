package test;

public class OuterClass {
	int a = 10;
	static int b = 20;

	void m1() {
		int c = 20;
		System.out.println(a);
		System.out.println(b);
	}// end of nsm()

	static void m11() {
		// System.out.println(a);
		System.out.println(b);

	}// end of sm()
//-----------------------------------------------------------    

	public class InnerCLass {
		void m2() {
			System.out.println(a);
			System.out.println(b);
		}

		static void m22() {
			// System.out.println(a);
			System.out.println(b);
		}
	}
}