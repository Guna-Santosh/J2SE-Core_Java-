package test;
//import test.*;

public class Tester {

	public static void main(String[] args) {

		FulltimeEmployee fp = new FulltimeEmployee(2000, 14, "san");
		System.out.println(fp.toString());
		System.out.println("fulltime salary = " + fp.computerSalary());

		ParttimeEmployee pt = new ParttimeEmployee(14, "san", 8, 400);
		System.out.println(pt.toString());
		System.out.println("parttime salary = " + pt.computerSalary());

	}

}
