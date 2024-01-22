package test;

class A {
	class b extends A {

		interface C {
			interface D extends C {

			}
		}

		class E implements test.A.b.C.D {

		}

	}
}

public class Pro1 {

	public static void main(String[] args) {

	}

}
