package test;

public class Saving extends Account
{
    double intrestRate;
	public double getIntrestRate() {return intrestRate;	}

	public void setIntrestRate(double intrestRate)
	{
		if(intrestRate>=0)
		this.intrestRate = intrestRate;
		else System.out.println("not allow");
	}

	@Override
	public String toString() 
	{
		return "Saving [intrestRate=" +accNumber +accBalance+ intrestRate + "]";
	}

	public Saving(long accNumber) {	super(accNumber);	}

	double computerInterest(double intrestPeriod) 
	{
		return 0.0;
	}

}
