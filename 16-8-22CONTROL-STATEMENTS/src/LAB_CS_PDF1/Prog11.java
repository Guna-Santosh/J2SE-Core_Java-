/*
Program-11
Define a method
which accepts three boolean value as 
arguments and return true 
if any of the two values are true, 
otherwise return false.


Write the method with the following 
specifications: 

Name of method countBoolean() 
// which accepts three boolean arguments, 
  return true if any of the two values are true,
   else return false.

Arguments: two arguments of type boolean
Return Type: a boolean value 
Specifications: The value returned by the method
 countBoolean() is determined by the 
 following rules:
If b1 = true, b2 = true, b3 = true then, return true
If b1 = true, b2 = true, b3 = false then, return true
If b1 = true, b2 = false, b3 = false then, return false
If b1 = false, b2 = false, b3 = false then, return false*/
package LAB_CS_PDF1;

public class Prog11 {
public String countBoolean(boolean b1, boolean b2, boolean b3)
	{
		if((b1==true) && (b2==true) && (b3==true))      	return "true";
		else if((b1==true)&&(b2==true)&&(b3==false)) 		return "true";
		else if((b1==true)&&(b2==false)&&(b3==false))		return "false";
		else if((b1==false)&&(b2==false)&&(b3==false))		return "false";
		else                                     			return "invalid boolean";
  	}
    public static void main(String[] args) 
    {
    	Prog11 obj=new Prog11();
     System.out.println(obj.countBoolean(true,false,false));
        }
	
}

