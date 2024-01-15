/*
Program-10
Define a method which accepts two value as arguments (an integer and boolean)
 and return the string indicating when the alarm should ring.
  The first argument indicating day of the week encoded as 
  0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation or not.

Write the method with the following specifications: 

Name of method ringAlarm() 
// which accepts two arguments, first indicating day of the week 
 and second a boolean indiacting if we are on vacation.
Arguments: two arguments of type integer and boolean
Return Type: an string value 
Specifications: The value returned by the method ringAlarm() 
is determined by the following rules:

If the first argument value is not between 0 to 6, return "Invalid Inputs"
If the second value is not boolean value true or false, return "Invalid Inputs"

If the first argument value is between 1 to 5 indicating the week day's 
and second value is true indicating on vacation, return "10:00"

If the first argument value is between 1 to 5 indicating the week day's 
and second value is false indicating not on vacation, return "07:00"

If the first argument value is 0 or 6 indicating the weekend day's 
and second value is true indicating on vacation, return "OFF"

If the first argument value is 0 or 6 indicating the weekend day's 
and second value is false indicating not on vacation, return "10:00"
*/package LAB_CS_PDF1;

public class Prog10 {
	String ringAlarm(int a , boolean b)
	{
		//if(a<0 && a>6)
		//	return "invalid";
		//else if(b!=true && b!=false)
			//return "invalid";
		 if((a>=1 && a<=5) &&b==true)      
			return "10:00";
		else if((a>=1 || a<=5) &&b==false) 
			return "07:00";
		else if((a==0 || a==6) &&b==true)   
			return "oof";
		else if((a==0 || a==6) &&b==false) 
			return "10:00";
		else 
			return "not matched";
	}
	public static void main(String[] args) {
		Prog10 obj=new Prog10();
		System.out.println(obj.ringAlarm(3,false));
	}
}