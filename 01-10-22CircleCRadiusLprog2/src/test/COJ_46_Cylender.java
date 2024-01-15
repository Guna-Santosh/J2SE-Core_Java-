
/*B. Create a sub class of COJ_46_Circle with name COJ_46_Cylender
      that inherits and add below details to the class

	1. Instance variables:
		height: double.
	2. Create a default constructor that assigns default 
	                     values to instance variables.
	3. Create parameterized constructor that accepts radius, height.
	4. Create below methods,

		Method name: getVolume
		Return type: double
	
		This method should return the volume of the cylender.
		 if height is negative Return -1.
*/
package test;
class COJ_46_Cylender extends COJ_46_Circle
{
  double height;//instance variable	
public COJ_46_Cylender() {
}
public COJ_46_Cylender(double height, double radius) {
	super(radius);
	this.height = height;
	
}
double getVolume()
{     
      if(height>0)
      {
    	  return super.getArea()*height;
      }
      else       return -1;
}
}