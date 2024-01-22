/*Program-1
Define a method which returns the 1 if the given number is even, in other case return 0
Name of method: isEven() // which accepts an integer value as argument and return 1 if the given number is even, else retrun 0.
Argument: int
Return type: an integer value 
Example, if x = 22, return 1. if x = 35, return 0*/

package LAB_CS_PDF1;

public class Pro1 {

	String iseven(int a) {
		if (a <= 0)
			return "zero";
		else if (a % 2 == 0)
			return "even";
		else
			return "odd";
	}// end of iseven method

	public static void main(String[] args) {
		System.out.println("ENTER NUMBER");
		java.util.Scanner s = new java.util.Scanner(System.in);
		int a = s.nextInt();

		Pro1 aobj = new Pro1();// object create

		System.out.println(aobj.iseven(a));
		s.close();
	}// end of main
}// end of class
