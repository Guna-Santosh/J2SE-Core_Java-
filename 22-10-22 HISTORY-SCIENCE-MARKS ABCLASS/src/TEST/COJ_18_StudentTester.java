/*Program-1
==========
Create a abstract class COJ_18_Student with the following attributes.

Instance Variables: 

studentName: protected String
studentClass: protected String
totalNoOfStudents : protected static int

Instance Methods:
abstract public : getPercentage( ) with return type int 

static Method :
public static int getTotalNoStudents( )

Constructors:
Default constructor is a MUST.
Parameter constructor must initialize name and class and it also increase totalNoOfStudents.

Create a class COJ_18_ScienceStudent that inherits from COJ_18_Student. 

Add the following attributes
Instance variables: 
physicsMarks: private int
chemistryMarks: private int
mathsMarks: private int

Methods:
Override, getPercentage() method to compute and return the percentage of marks
                                                               (Max marks for a subject :100)

Create a class COJ_18_HistoryStudent that inherits from COJ_18_Student. 

Add the following attributes.

Instance variables:
historyMarks: private int
civicsMarks: private int     (Max Marks for a subject : 100)

Method:
Override getPercentage() method to computed and return the percentage of marks
                                                                     (Max marks for a subject :100)


Given a class COJ_18_StudentTester with main method, use this class to test your code.
Test all the three classes and the abstract method implementation with different inputs.

*/
package TEST;

public class COJ_18_StudentTester 
{
	public static void main(String[] args) 
	{
		
	    COJ_18_ScienceStudent ss=new COJ_18_ScienceStudent("santosh","chemist",10);
	    System.out.println(ss.getPercentage());
	    System.out.println("======================================");
	    COJ_18_HistoryStudent hs = new COJ_18_HistoryStudent("santosh","history",20);	
	    System.out.println(hs.getPercentage());
	}

}
