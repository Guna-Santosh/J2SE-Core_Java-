package pistring;
import java.util.Scanner;
import java.util.StringTokenizer;
public class LeapyYear {
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);
	try(s)
	{
		System.out.print("Enter the year : ");
		int year=s.nextInt();
		String year1=(year%400==0)||(year%4==0&&year%100!=0)?"leapy":"not leapy";
		System.out.println(year+" is a "+year1);
	}
	StringTokenizer sb=new StringTokenizer("   san jhd jsj    jsj jhs        ");
	System.out.println(sb.countTokens());
}
}
