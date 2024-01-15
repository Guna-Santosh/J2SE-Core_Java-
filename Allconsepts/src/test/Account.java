package test;

public abstract class Account
{
  protected long accNumber;  protected double accBalance;

  public Account(long accNumber) {this.accNumber = accNumber;}

  abstract double computerInterest(double intrestPeriod);
  
public long getAccNumber() {return accNumber;}
public double getAccBalance() {return accBalance;}

public void setAccNumber(long accNumber) {this.accNumber = accNumber;}
public void setAccBalance(double accBalance) {this.accBalance = 0;}

@Override
public String toString() {
	return "Account # =<accNumber>" + accNumber + ", accBalance=" + accBalance + "]";
}





  
  
  
  
}
