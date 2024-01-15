/*
 Que-1)
----------
Class Circle is given to you. Add below details to the class
	1. Instance variables:
		radius: double.
	2. Create a default constructor that assigns 
	                 default values to instance variables.
	3. Create parameterized constructor that accepts radius.
	4. Create below methods,
		Method name: getArea
		Return type: double
	
		This method should return the area of the circle.
		Return -1 if radius is negative.

B. Create a sub class of COJ_46_Circle with name COJ_46_Cylender
      that inherits and add below details to the class

	1. Instance variables:
		height: double.
	2. Create a default constructor that assigns default values to instance variables.
	3. Create parameterized constructor that accepts radius, height.
	4. Create below methods,

		Method name: getVolume
		Return type: double
	
		This method should return the volume of the cylender.
		Return -1 if height is negative.

   Given a class COJ_46_Testing that contains main method.
   Use this class to test your code.*/
package test;
import java.util.Scanner;
public class COJ_46_Testing {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE RADIUS = ");
		double radius =s.nextDouble();
		System.out.print("ENTER THE HEIGHT = ");
		double height =s.nextDouble();
		COJ_46_Cylender cr=new COJ_46_Cylender(height,radius);
		//double vol=cr.getVolume();
		System.out.print("AREA OF CYLENDER |:| = ");
		System.out.println(cr.getVolume());s.close();
	}//END OF MAIN()

}//END OF CLASS
