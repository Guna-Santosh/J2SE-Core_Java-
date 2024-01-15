package CLASSASSIMENT;

import java.util.Scanner;

class greatest
{
	int gt(int a,int b, int c)
	{
	if(a>b && a>c)
		return a;
	else if(b>c && b>c)
		return b;
	else return c;
	}
   
}
class smallest
{
	public int st(int a, int b, int c) 
	{
	if(a<b&&a<c)
		return a;
	else if(b<a&&b<c)
	return b;
	else 
		return c;
	}
}
public class GSsubclss
{
    public static void main(String[] args)
    {
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER 1ST NUMBER");
	int aa=s.nextInt();
	System.out.println("ENTER 2ND NUMBER");
	int bb=s.nextInt();
	System.out.println("ENTER 3RD NUMBER");
	int cc=s.nextInt();
	System.out.println("1.GRATESR\t2.SMALLEST");
	int c=s.nextInt();
	switch(c) 
	{
	case 1:
		System.out.print("GREATEST = ");
		greatest g=new greatest();
		int gt=g.gt(aa,bb,cc);
		System.out.println(gt);
		break;
		//System.out.println( g.gt(aa, bb, cc));
	case 2:	
		System.out.print("SMALLEST = ");
		smallest st=new smallest();
		int sm=st.st(aa,bb,cc);
		System.out.println(sm);break;
	}
	}
}
