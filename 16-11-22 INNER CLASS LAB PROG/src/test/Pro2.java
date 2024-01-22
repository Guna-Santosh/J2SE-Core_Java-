package test;

class Boo {
	Boo(String s) {

	}

	Boo() {
	}
}

class Bar extends Boo {
	Bar() {
	}

	Bar(String s) {
		super(s);
	}

	void zoo() {
		Boo f = new Bar() {
		};
		Boo f1 = new Bar("hi") {
		};

		// Boo f=new Boo(24) {};
		// Bar f=new Boo.Bar(String s) {};
		// Bar f=new Boo(String s) {};
	}

}

public class Pro2 {

	public static void main(String[] args) {

	}

}
