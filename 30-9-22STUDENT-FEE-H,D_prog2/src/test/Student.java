package test;

public class Student 
{
int Studentid;String name;double examFee;
      
      public double payFee(double amt) 
      {  
    	  double sum=examFee+amt;
    	  return sum;
      }//end of pf()
	     public Student(int studentid, String name, double examFee) {
		  this.Studentid = studentid;
		  this.name = name;
		  this.examFee = examFee;
	}
		@Override
		public String toString() {
			return "Student [Studentid=" + Studentid + ", name=" + name + ", examFee=" + examFee + "]";
		}
      
      
      
}//end of class
