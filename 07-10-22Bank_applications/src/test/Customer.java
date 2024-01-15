/*Que-2)
________________
Implement a bank application that requires two classes namely,
Account and Customer.

The class Customer is given and has the following specifications.

Customer:
Instance Variables: firstName, lastName.(both Strings)
Getters/setters ,default constructor, and parameter constructor.

A class Account is given and has the following specifications.
    
Account:
 Instance Variables:customer(of type Customer), balance: double, accountNo: int, interestRate:float
 Methods: 
 	deposit(amount) deposits the given amount. Add the given amount to balance
	withdraw(amount) withdraw /subtract the amount from balance if the amount is less than balance. Other wise do not withdraw.


A tester class BankTester with the main method is given to you.
 Use this class to test your solution.
*/
package test;
public class Customer 
{
   String firstname,lastname;

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}



public Customer() {
}

public Customer(String firstname, String lastname) {
	this.firstname = firstname;
	this.lastname = lastname;
}
   
   
   
}
