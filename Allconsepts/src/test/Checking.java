package test;

public class Checking extends Account{

	
	public Checking(long accNumber)
	{
		super(accNumber);
	}
	double computerInterest(double intrestPeriod)
	{
	   	return 0.0;
	}
	@Override
	public String toString() {
		return "Checking [accNumber=" + accNumber + ", accBalance=" + accBalance +  "]";
	}

}
