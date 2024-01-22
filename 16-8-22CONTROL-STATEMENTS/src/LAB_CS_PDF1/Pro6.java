/*Program-6
Define a method which returns the string as "Even" if the given number is an even number, return "Odd" if the given number is an odd number, return string as "Invalid Input" if the given number is lessthan or equal to 0.
Write the method with the following specifications: 

Name of method: isEvenOrOdd() // which accepts an integer value as argument.

Arguments: one argument of type integer

Return Type: a String value (Even/Odd/Invalid Input) 
Specifications: The value returned by the method isEvenOrOdd() is determined by the following rules:
If the given number is negative or zero, return "Invalid Input"
If the given number is even, return "Even"
If the given number is odd, return "Odd"*/
package LAB_CS_PDF1;

public class Pro6 {
	String evenorodd(int a) {
		if (a == 0)
			return "invalid";
		else if (a % 2 == 0)
			// System.out.println("even");
			return "even";
		else if (a % 2 == 1)// System.out.println("odd");
			return "odd";
		else // System.out.println("invalid");
			return "invalid";
		// System.out.println("greatest");
	}

	public static void main(String[] args) {
		Pro6 aobj = new Pro6();
		System.out.println(aobj.evenorodd(-3));
	}
}
