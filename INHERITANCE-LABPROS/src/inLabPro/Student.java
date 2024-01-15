/*Progarm-3
---------
A class Student is given to you.
Instance Variables: 
studentId :private-int
studentName : private-String
marks: private-int
grade: private-char

method : calculateGrade():public:void
Create a Default constructor
Create a parameterized constructor with the parameters: studentId, studentName, marks.
Note that grade is not set either through constructor  because it is a calculated value.
Methods :
displayDetails(): This method should return a String with  the details of the student in the following format:
Student [name=John Smith, studentId=123, marks=95, grade=A] 

A class Tester with main method is given to you to test your code.
*/package inLabPro;
import java.util.Scanner;
public class Student
{
	private int studentId,marks;
	private String studentName;
	private char grade;
   
   public Student()
   {
	   
   }
   
   public Student(int studentId, int marks, String studentName, char grade) 
   {
	super();
	this.studentId = studentId;
	this.marks = marks;
	this.studentName = studentName;
	this.grade = grade;
   }

   private void calculatGrade() 
   {/*calculateGrade(): This is a private method that
                         calculates the grade based on the marks that is set. 
If marks are above 90, grade is set to A. 
If marks are between 81 and 90, grade is set to B, 
if marks are between 71 and 80, grade is set to C, 
if marks are between 61 and 70, grade is set to D, 
if marks are less than 61, grade is set to E.
Use this method when you need to set or reset grade.
*/
	  if(marks>90) 
	  System.out.println("A");
	  else if(marks>81&&marks<90)
		  System.out.println("B");
	  else if(marks>71&&marks<80)
	   System.out.println("C");
	  else if(marks>61&&marks<70)
		  System.out.println("D");
	  
   }
   public String displayDetails()
   {
	   calculatGrade();
	  return toString();
   
   }

@Override
public String toString() {
	return "Student [studentId=" + studentId + ", marks=" + marks + ", studentName=" + studentName + ", grade=" + grade
			+ "]";
}
   
   

}//end of class
