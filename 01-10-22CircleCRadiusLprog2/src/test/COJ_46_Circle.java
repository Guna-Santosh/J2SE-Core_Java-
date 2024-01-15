/*Class Circle is given to you. Add below details to the class

	1. Instance variables:
		radius: double.
	2. Create a default constructor that assigns 
	            default values to instance variables.
	3. Create parameterized constructor that accepts radius.
	4. Create below methods,
		Method name: getArea
		Return type: double
	
		This method should return the area of the circle.
		 if radius is negative Return -1.

*/package test;

public class COJ_46_Circle {
   double radius;//variable

public COJ_46_Circle() {
}//end of dconstructers

public COJ_46_Circle(double radius) {
	this.radius = radius;
}//end of pconstructer
    
   double getArea() 
   { //double k=0.0; 
   if(radius>0)
   {
	   return 3.14*radius*radius;
   }
	     else       return -1;
   }//end of getArea()
  
 }//end of class
