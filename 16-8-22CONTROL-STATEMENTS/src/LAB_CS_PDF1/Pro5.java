/*
Program-5
Define a method which returns the 1 if the given number is positive, return -1 if the given number is negative, return 0 if the given number is 0.

Name of method findSign() 
Arguments: one argument of type integer
Return Type: an integer value 
Test Cases
1.	If any of the given number is positive, return 1.
2.	If any of the given number is negative, return -1.
3.	If any of the given number is zero, return 0.*/
package LAB_CS_PDF1;

public class Pro5 {
	public int findsign(int a) {
		if (a < 0)
			return -1;
		else if (a > 0)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		Pro5 obj = new Pro5();
		System.out.println(obj.findsign(9));
	}
}
