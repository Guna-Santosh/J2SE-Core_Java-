package Labpdf1;
public class Prog67_FIZZBIZZ 
{
	String getFizzBizz(int n)
	{   String s1="";
	    if(n==0||n<0||n%3!=0&&n%5!=0)s1="Error";
	    else if(n%3==0&&n%5==0)      s1="FIZZBIZZ";
	    else if(n%3==0)              s1="fizz";
		else if(n%5==0)              s1="bizz";
	    return s1;
	}
	public static void main(String[] args) 
	{
		Prog67_FIZZBIZZ sp=new Prog67_FIZZBIZZ();
	    System.out.println(sp.getFizzBizz(35));
	}
}
