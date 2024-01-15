package HOSTALPROG;

import java.util.Scanner;

public class Shopbill//main class
{ 
	public int fruit (int a, Scanner s)//method-1
	{
	int sm,sa,sb,sp,sg,so;
	switch(a) 
	{
		case 125: 
			System.out.print("MANGOES IS U CHOOSED HOW MANY KGS U NEED = " );
			int p=s.nextInt();
					 sm=p*50;
			System.out.println("TOTAL PRICE OF MANGOES = "+sm);break;
		case 126:
			System.out.print("APPLES IS U CHOOSED HOW MANY KGS U NEED = ");
			int q=s.nextInt();
			 sa=q*100;
			System.out.println("TOTAL PRICE OF APPLES ="+sa);break;
		case 127:
			System.out.print("BANANANS IS U CHOOSED HOW MANY KGS U NEED = ");
			int r=s.nextInt();
			sb=r*25;
			System.out.println("TOTAL PRICE OF BANANANS = "+sb);break;		
		case 128:
			System.out.print("PAPAYAS IS U CHOOSED HOW MANY KGS U NEED = ");
			int t=s.nextInt();
			sp=t*44;
			System.out.println("TOTAL PRICE OF PAPAYAS = "+sp);break;
		case 129:
			System.out.print("GRAPES IS U CHOOSED HOW MANY KGsssS U NEED = ");
			int u=s.nextInt();
			sg=u*60;
			System.out.println("TOTAL PRICE OF GRAPES = "+sg);break;
		case 130:
			System.out.print("ORANGES IS U CHOOSED HOW MANY KGS U NEED = ");
			int v=s.nextInt();
			so=v*50;
			System.out.println("TOTAL PRICE OF ORANGES = "+so);break;
		}	//end of swicth case
	//int sum=sum+sm
			System.out.println("\n----DO U WANT ANY OTHER FRUITS YES=1,NO=2---- ");
			System.out.print("\nwhat is ur choose = ");
			int ye=s.nextInt();
			if(ye==1) 
			{
				System.out.print("chose one code = ");
				Shopbill f=new Shopbill();
	            int ab=s.nextInt();
	            f.fruit(ab,s);	
			}// end of if condition
			
			else if (ye==2)
			//{System.out.println("total="+sum);
				System.out.println("SELECT SOME VEGATABLES");
				
				System.out.println("225 POTATO 1kg is 41");
				System.out.println("226 BRINJAL 1kg is 35");
				System.out.println("227 CARROT 1kg is 60");
				System.out.println("228 BEATROOT 1kg is 44");
				System.out.println("229 DRUM STRICK 1kg is 60");
				System.out.println("230 MUSHROOM 1kg is 50");
				ShoppingBill v=new ShoppingBill();  
		        int b=s.nextInt();
		    	int ve=v.vegatables(b,s);
				return ve;
			}
//	return a;
	
//}//end of method
	
	public static void main(String[] args) 
	{
      Scanner s=new Scanner(System.in);
      System.out.println("welcome to dmart");
      System.out.println("here fruits is avaliable");
      System.out.println("do u want to buy yes=1 no=2");
     // int z = 0;
      int y=s.nextInt();
      if(y==1) 
    	  
	{
    		System.out.println("SELECT SOME FRUITS");
    		
    		System.out.println("125 MANGOES 1kg is 50");
    		System.out.println("126 APPLES ikg is 100");
    		System.out.println("127 BANANANS 1kg is 25");
    		System.out.println("128 PAPAYAS 1kg is 44");
    		System.out.println("129 GRAPES 1kg is 60");
    		System.out.println("130 ORANGES 1kg is 50");
    		System.out.print("chose one code = ");
            Shopbill f=new Shopbill();
            int a=s.nextInt();
            f.fruit(a,s);
     }
      System.out.println("do u want buy any vegatables");
      {
    	if(y==1)  
    	{
	if(y==2) 
	{
		System.out.println("SELECT SOME VEGATABLES");
		
		System.out.println("225 POTATO 1kg is 41");
		System.out.println("226 BRINJAL 1kg is 35");
		System.out.println("227 CARROT 1kg is 60");
		System.out.println("228 BEATROOT 1kg is 44");
		System.out.println("229 DRUM STRICK 1kg is 60");
		System.out.println("230 MUSHROOM 1kg is 50");
		ShoppingBill v=new ShoppingBill();  
        int b=s.nextInt();
    	int ve=v.vegatables(b,s);
	}
    	}
    	System.out.println("hear vegatables is so fresh once try it ");}
     }// end of main 
	
}//end of main class 

