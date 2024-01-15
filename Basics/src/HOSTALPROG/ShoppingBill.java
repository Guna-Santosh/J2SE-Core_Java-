package HOSTALPROG;
import java.util.*;
public class ShoppingBill 
{
	int fruits(int a)
	{   //int z=0,c=0,su=0;
	Scanner s=new Scanner(System.in);
 //for(int i=0;;) 
 //{
			switch(a) 
		{    
		case 125: 
			System.out.println("MANGOES IS U CHOOSED HOW MANY KGS U NEED");
			int p=s.nextInt();
			System.out.println("TOTAL PRICE OF MANGOES:"+p*50);break;
		case 126:
			System.out.println("APPLES IS U CHOOSED HOW MANY KGS U NEED");
			int q=s.nextInt();
			System.out.println("TOTAL PRICE OF MANGOES:"+q*100);break;
		case 127:
			System.out.println("BANANANS IS U CHOOSED HOW MANY KGS U NEED");
			int r=s.nextInt();
			System.out.println("TOTAL PRICE OF MANGOES:"+r*25);break;		
		case 128:
			System.out.println("PAPAYAS IS U CHOOSED HOW MANY KGS U NEED");
			int t=s.nextInt();
			System.out.println("TOTAL PRICE OF MANGOES:"+t*44);break;
		case 129:
			System.out.println("GRAPES IS U CHOOSED HOW MANY KGsssS U NEED");
			int u=s.nextInt();
			System.out.println("TOTAL PRICE OF MANGOES:"+u*60);break;
		case 130:
			System.out.println("ORANGES IS U CHOOSED HOW MANY KGS U NEED");
			int v=s.nextInt();
			System.out.println("TOTAL PRICE OF MANGOES:"+v*50);break;
		}
			System.out.println("\n----DO U WANT ANY OTHER FRUITS YES=1,NO=2---- ");
			int x=s.nextInt();
			if(x==1) {//c++; su=su+c;
			
			System.out.println("CHOOSE ONE CODE");
		
			ShoppingBill f=new ShoppingBill();
			int ab=s.nextInt();
			int fr=f.fruits(ab);
            
			}
			else if(x==2)
			{
				System.out.println("UR TOTAL FRUITS PRICE=");
				System.out.println("DO U WANT TO BUY VEGATABLES");
				
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
			//if(z==1) 
			//{
			//i++;
			//1}
			return 0;
  }
	//}
	
	int vegatables(int b,Scanner s) 
	{
		switch(b) 
		{
		case 225: 
			System.out.println("POTATO IS U CHOOSED HOW MANY KGS U NEED");
			int Z=s.nextInt();
			System.out.println("TOTAL PRICE OF POTATA="+Z*41);
			break;
		case 226:
			System.out.println("BRINJAL IS U CHOOSED HOW MANY KGS U NEED");
			int Y=s.nextInt();
			System.out.println("TOTAL PRICE OF BRINJAL="+Y*35);break;
		case 227:
			System.out.println("CARROT IS U CHOOSED HOW MANY KGS U NEED");
			int x=s.nextInt();
			System.out.println("TOTAL PRICE OF CARROT="+x*60);break;
		case 228:
			System.out.println("BEATROOT IS U CHOOSED HOW MANY KGS U NEED");
			int W=s.nextInt();
			System.out.println("TOTAL PRICE OF BEATROOT="+W*44);break;
		case 229:
			System.out.println("DRUM STRICK IS U CHOOSED HOW MANY KGS U NEED");
			int V=s.nextInt();
			System.out.println("TOTAL PRICE OF DRUM STRICK="+V*60);break;
		case 230:
			System.out.println("MUSHROOM IS U CHOOSED HOW MANY KGS U NEED");
			int U=s.nextInt();
			System.out.println("TOTAL PRICE OF POTATA="+U*41);break;
		}
		System.out.println("\n----DO U WANT ANY OTHER FRUITS YES=1,NO=2---- ");
		
		return b;
	}
	
	int cosmatics(int c)
	{
		switch(c) 
		{
		case 325: 
			System.out.println("FFRAN & LOVELY IS U CHOOSED HOW MANY KGS U NEED");break;
		case 326:
			System.out.println("EYE LINEAR IS U CHOOSED HOW MANY KGS U NEED");break;
		case 327:
			System.out.println("HIMALAYA FACE WASH IS U CHOOSED HOW MANY KGS U NEED");break;
		case 328:
			System.out.println("WILD STONE IS U CHOOSED HOW MANY KGS U NEED");break;
		case 329:
			System.out.println("WATER BOTTLES IS U CHOOSED HOW MANY KGS U NEED");break;
		case 330:
			System.out.println("CLOSEUP PASTE IS U CHOOSED HOW MANY KGS U NEED");break;
			
		}
		System.out.println("enter some quantity");
		return c;
	}
	
	int masalapowerders(int d)
	{
		switch(d) 
		{
		case 425: 
			System.out.println("Chaat Masala IS U CHOOSED HOW MANY KGS U NEED");break;
		case 426:
			System.out.println("Biryani Masala IS U CHOOSED HOW MANY KGS U NEED");break;
		case 427:
			System.out.println("Sambhar Masala IS U CHOOSED HOW MANY KGS U NEED");break;
		case 428:
			System.out.println("Garam Masala IS U CHOOSED HOW MANY KGS U NEED");break;
		case 429:
			System.out.println("Coriander Masala IS U CHOOSED HOW MANY KGS U NEED");break;
		case 430:
			System.out.println("Chicken Masala IS U CHOOSED HOW MANY KGS U NEED");break;
		}
		return d;
	}
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("*******WELCOME TO DMART******");
		
		System.out.println("=============================");
		System.out.println("1.FRUITS\t2.VEGATABLES \n3.COSMATICS     4.MASALA POWEDERS");
		System.out.println("\n     CHOOSE ANY ONE OPTION   ");
		
		int choose=s.nextInt();
		//Task:
		switch(choose) 
		
		{
		
		case 1:	
		System.out.println("SELECT SOME FRUITS");
		
		System.out.println("125 MANGOES 1kg is 50");
		System.out.println("126 APPLES ikg is 100");
		System.out.println("127 BANANANS 1kg is 25");
		System.out.println("128 PAPAYAS 1kg is 44");
		System.out.println("129 GRAPES 1kg is 60");
		System.out.println("130 ORANGES 1kg is 50");
		
		System.out.println("CHOOSE ONE CODE");
		ShoppingBill f=new ShoppingBill();
		int a=s.nextInt();
		int fr=f.fruits(a);
		//if(choose==1)
			//break Task;
		
		break;
		
		case 2:
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
		   break;
		
		case 3:
			System.out.println("SELECT SOME COSMATICS");
			
			System.out.println("FFRAN & LOVELY");
			System.out.println("EYE LINEAR");
			System.out.println("HIMALAYA FACE WASH");
			System.out.println("WILD STONE");
			System.out.println("WATER BOTTLES");
			System.out.println("CLOSEUP PASTE");
			
		ShoppingBill cos=new ShoppingBill();
		int c=s.nextInt();
		int co=cos.cosmatics(c);break;
		
		case 4:
			System.out.println("SELECT SOME MASALA POWEDERS");
			
			System.out.println("Chaat Masala");
			System.out.println("Biryani Masala");
			System.out.println("Sambhar Masala");
			System.out.println("Garam Masala");
			System.out.println("Coriander Masala");
			System.out.println("Chicken Masala");
			
		ShoppingBill m=new ShoppingBill();
		int d=s.nextInt();
		int mp=m.masalapowerders(d);
		}
	}

}
