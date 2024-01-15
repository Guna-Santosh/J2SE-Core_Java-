package Basics;
import java.util.Scanner;
@SuppressWarnings("resource")
public class AllBasicPrograms 
{
	public  static void main(String[] args) 
	{
		while(true) 
		{
		System.out.println("----Choice----");
		System.out.println
				 ("1.Fibonacci Series\n"
				+ "2.Reverse Number\n"
				+ "3.Perfect Number\n"
				+ "4.Factorial Number\n"
				+ "5.Prime Number \n"
				+ "6.Armstrong Number\n"
				+ "7.Strong Number\n"
				+ "8.Neon Number\n"
				+ "9.LCM\n"
				+ "10.GCD/HCF\n"
				+ "11.Palindrome Number\n"
				+ "12.Leapy Year\n"
				+ "13.Abundant Number\n"
				+ "14.Harshad Number\n"
				+ "15.Table\n"
				+ "16.Exit");
		System.out.println(".*.*Select Which Output u Want*.*.");
		Scanner s=new Scanner(System.in);
		switch(new Scanner(System.in).nextInt()) 
		{
		//----------Fibonacci Series-------
		case 1:  
			System.out.println("Output of Fibonacci Series");
			int a=0,b=1;int c;
			System.out.print("Enter the Size = ");
			int f=s.nextInt();
			System.err.print(a+" "+b+" ");
			for(int i=0;i<f-2;i++)
			{
				c=a+b;a=b;b=c;
				System.err.print(c+" ");
			}
		break;
		//---------Reverse Number------------
		case 2:
			System.out.println("Output of Reverse Number");
			System.out.print("Enter the Number = ");
			int re=s.nextInt();
			System.err.print("Reverse of "+re+" is ");
			int rev=0;
			while(re>0) 
			{
				rev=rev*10+re%10;
				re=re/10;
			}System.err.println(rev);
		break;
		//------Perfect Number--------
		case 3:
			System.out.println("Output of Perfect Number");
			System.out.print("Enter the Number = ");
			int p=s.nextInt();int sum=0;
			for(int i=1;i<p;i++) 
			{
			  if(p%i==0)sum+=i;
			}
			String pfN=(sum==p)?p+" is Perfect Number":p+" is Not a Perfect Number";
			System.err.println(pfN);
		break;
		//------Factorial Number------
		case 4:
			System.out.println("Output of Factorial Number");
			System.out.print("Enter the Number = ");
			int n=s.nextInt();
			int fact=1;
			for(int i=1;i<=n;i++) 
			{
				fact=fact*i;
			}System.err.println("Factorial of "+n+" is "+fact);
		break;
		//-------Prime Number---------
		case 5:
			System.out.println("Output of Prime Number");
			System.out.print("Enter the Number = ");
			int pn=s.nextInt();int c1=0;
			for(int i=1;i<=pn;i++) 
			{
				if(pn%i==0)c1++;
			}
			String prN=(c1==2)?pn+" is a Prime Number":pn+" is not a Prime Number";
				System.err.println(prN);
		break;
		//-------Armstrong Number------
		case 6:
			System.out.println("Output of Armstrong Number");
			System.out.print("Enter the Number = ");
			int am=s.nextInt(); int m,k,amsum=0;
			int num=String.valueOf(am).length(); 
			//System.out.println((am+"").length());
			int k1=am;
		for(int i=1;i<=num;i++) 
		{
			m=1;	k=am%10; 
			for(int j=1;j<=num;j++)
			{
				m=m*k;
			}
		    amsum=amsum+m;    am=am/10;
		}
		String s1=(k1==amsum)?k1+" Armstrong Number":k1+" Not a Armstrong Number";
			System.err.println(s1);
		//4210818,548834,54748,6474,153,9 checks this no's
		break;
		//------Strong Number----------
		case 7:
			System.out.println("Output of Strong Number");
			System.out.print("Enter the Number = ");
			int number=s.nextInt();int copy=number;
			int sum1=0;
			while(copy>0) 
			{  
				int digit=copy%10;
				int factorial=1;
				for(int i=1;i<=digit;i++) 
				{
					factorial*=i;
				}
					sum1+=factorial;
					copy/=10;
			}
			String ch=(sum1==number)?" is a Strong Number":" Not a Strong Number";
		    System.err.println(number+""+ch);
		break;
		//------Neon Number------------
		case 8:
			System.out.println("Output of Neon Number");
			System.out.print("Enter the Number = ");
			int number1=s.nextInt();
			int squ=number1*number1;
			int sum2=0;
			while(squ>0) 
			{
				int dit=squ%10;
				sum2+=dit;	squ/=10;
			}
			String st=(sum2==number1)?"is Neon Number":"Not aNeon Number";
			System.err.println(number1+" "+st);
			break;
		//-------LCM----------------
		case 9:
			System.out.println("Output of LCM");
			System.out.print("Enter the aa value = ");
			int aa=s.nextInt();
			System.out.print("Enter the bb value = ");
			int bb=s.nextInt(); int lcm=1;//**
			int min=Math.min(aa, bb);
			for(int i=1;i<min;i++) 
			{
				if(aa%i==0||bb%i==0)
				{
					lcm*=i;//**
					if(aa%i==0)	aa/=i;
					if(bb%i==0)	bb/=i;
				}
			}
			lcm*=aa*bb;//**
		    System.err.println("The LCM of " + aa + " and " + bb + " is " + lcm);
		break;
		//--------GCD/HCF---------------
		case 10:
			System.out.println("Output of GCD/HCF");
			System.out.print("Enter the aa value = ");
			int A=s.nextInt();
			System.out.print("Enter the bb value = ");
			int B=s.nextInt(); int gcd=1;//**
			int min1=Math.min(A, B);
			for(int i=1;i<min1;i++) 
			{
				if(A%i==0&&B%i==0)	gcd*=i;//**
			}
			System.err.println("The GCD of " + A + " and " + B + " is " + gcd);
			break;
		//-------Palindrome Number----------------
		case 11:
			System.out.println("Output of Palindrome Number");
			System.out.print("Enter the Number = ");
			int pal=s.nextInt();int sin=pal;
			int revs=0;
			while(pal>0) 
			{
				revs=revs*10+pal%10;
				pal=pal/10;
			}
			String out=(revs==sin)?" Palindrome Number":" Not a Palindrome Number";
			System.err.println(sin+""+out);
		break;
		//------Leapy year/ not------
		case 12:
			System.out.println("Output of Leapy Year/Not");
			System.out.print("Enter the Year = ");
			int year=s.nextInt();
			String y=((year%400==0)||(year%100!=0&&year%4==0))?"leapy":"not leapy";
			System.out.println(y);
		break;
		//-------Abundant Number------
		case 13:
			System.out.println("Output of Abundant Number");
			System.out.print("Enter the Number = ");
			int amb=s.nextInt();int sum3=0;
			for (int i = 1; i < amb; i++)
			{ 
				if (amb % i == 0) 
				sum3 = sum3+ i; 
			} 
			String amn=(sum3 > amb)?" Abundant Number":" Not a Abundant Number";
			System.err.println(amb+""+amn);
		break;
		//-------Harshad Number--------
		case 14:
			System.out.println("Output of Harshad Number");
			System.out.print("Enter the Number = ");
			int ha=s.nextInt(); int result22=0;int cp=ha;
			while (ha>0) 
			{
				result22+=ha%10;
				ha/=10;
			}
			String han=(ha%result22==0)?" Harshad Number":" Not a Harshad Number";
			System.err.println(cp+""+han);
		break;
		//---------Table--------------
		case 15:
			System.out.println("Output of Table");
			System.out.print("Enter the number = ");
			int nt=new Scanner(System.in).nextInt();
			for(int i=1;i<=10;i++)
				System.err.println(nt+"*"+i+"="+nt*i);
		break;
		case 16:
			System.out.println("....operation as be exit....");
			System.exit(0);
		break;
		default :
			System.err.println("Invalid Selection");
		}//end of switch
	  }//end of while
   }//end of main()
}//end of class