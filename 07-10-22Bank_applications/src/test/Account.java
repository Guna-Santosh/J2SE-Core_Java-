/*A class Account is given and has the following specifications.
    
Account:
 Instance Variables:customer(of type Customer),
 balance: double,
 accountNo: int, 
 interestRate:float
 
 Methods: 
 	
 	deposit(amount) deposits the given amount.
 	Add the given amount to balance
	withdraw(amount) withdraw /subtract the amount from
	balance if the amount is less than balance. 
	Other wise do not withdraw.*/
package test;

public class Account  {
    double balance;
    int    accountNo;
    float  interestRate;
    Customer cs; 
    
   public Account(double balance, int accountNo, float interestRate, Customer cs) {
		//super();
	   this.balance = balance;
		this.accountNo = accountNo;
		this.interestRate = interestRate;
		this.cs = cs;
	}
void deposit(int amount)
   {
	  balance=balance+amount;
	 System.out.println(balance);
   }
   void withdraw(int amount) 
   {   if(amount<balance) 
	   balance=balance-amount;
   else System.out.println("unsufficent balance");
   }
}
