/*Program-2
---------------------------
A class Student is given to you. It contains the following implementation.
Instance Variables: studentId : int , name :String , examFee:double
Methods: displayDetails(): String , payFee() :double
Default constructor, an all-fields constructor and a toString method.
Create two sub classes of Student called DayScholar and Hosteller. Add the following implementations to each class.

DayScholar:
==============

Instance Variables : transportFee:double ,

Methods: Default constructor and an all-fields constructor


Hosteller:
================

Instance Variables: hostelFee :double

Methods: Default constructor and an all-fields constructor .



Add the following methods in BOTH classes.

Method: displayDetails(): This method should return a string 
containing the details of the student in the following format:

Student [name=John Smith,studentId=123,examFee=100.0] OR

DayScholar[transportFee=500, name=John Smith,studentId=123,examFee=100.0]
and so on.

Method: payFee(amount): This method takes amount as parameter that represents the fee provided. You must calculate and
then return the remaining amount paid in excess. If excess is paid, the returned amount will be negative. 
The total fees that each student must pay must include all the fees applicable to that 
Student(examFees, transportFees, hostelFees as applicable).
Subtract the given amount from total fee for each student and return the remaining amount.
A class StudentTester is given to you with a main method. Use this class to test your solution's classes and methods.
*/package maccess;

import test.*;
public class Conecting_p_c
{
public static void main(String[] args) {
	/*Scanner s=new Scanner(System.in);
	System.out.println("ENTER THE ID:");
	int id=s.nextInt();
	System.out.println("ENTER THE NAME:");
	String name =s.next();
	System.out.println("ENTER THE EXAM FEE:");
	double ef=s.nextDouble();
	System.out.println("ENTER THE TRANSPORT:");*/
	Student st=new Student(10,"san",10.2);
	System.out.println(st.payFee(300));
	System.out.println(st.toString());
	Hosteller ha=new Hosteller(143,"sammn",50.0,20.0);
	System.out.println(ha.payfee(300));
	DayScholar ds=new DayScholar(12,"sanm",50.2,20.1);
	System.out.println(ds.payfee(200));
	
}//end of main()
}//end of class
