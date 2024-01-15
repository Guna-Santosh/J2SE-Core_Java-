package test;

public class BankTester  {

	public static void main(String[] args) {
		java.util.Scanner s=new java.util.Scanner(System.in);
      BankTester bt =new BankTester();
      System.out.print("enter the balance =");
      double balance=s.nextDouble();
      System.out.print("enter the accountNo = ");
      int accountNo=s.nextInt();
      System.out.print("interestrate = ");
      float interestRate=s.nextFloat(); 
      Customer cs=new Customer();
      Account ac =new Account(balance,accountNo,interestRate,cs);
     System.out.print("deposit = ");
      ac.deposit(5000);
      ac.withdraw(300);
     
      
      

      
      
      
	}

}
