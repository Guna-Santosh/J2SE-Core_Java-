package test;

public class Hosteller extends Student 
{
    double hostelFee;
   
    public Hosteller(int studentid,String name,double examFee,double hostelFee)
    {    super(studentid,name,examFee);
    	this.hostelFee=hostelFee;
    }
    String displayDetails()
    {    
           return "hostelfee"+hostelFee+"name"+name+"id"+Studentid+"examfee"+examFee;    	
    }
    public double payfee(double amt) 
    {
    	double pf=examFee+hostelFee;
    	return amt-pf;
    }

}
