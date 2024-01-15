/*DayScholar:
==============

Instance Variables : transportFee:double ,

Methods: Default constructor and an all-fields constructor
*/
package test;

public class DayScholar extends Student
{
double transportfee;
	public DayScholar(int studentid, String name, double examFee, double transportfee) {
		super(studentid, name, examFee);
		this.transportfee=transportfee;
	}
	@Override
	public String toString() {
		return "DayScholar [transportfee=" + transportfee + ", Studentid=" + Studentid + ", name=" + name + ", examFee="
				+ examFee + "]";
	}
   public double payfee(double amt) 
   {
	   double sum=examFee+transportfee;
	   return amt-sum;
   }
  
}//end of class
