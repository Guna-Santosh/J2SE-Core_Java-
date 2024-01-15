/*wap to read six submarks and calculate:

totMarks
percentage
result

(i)If all the Sub marks are in b/w 0 to 100 then perform
calculations,else msg as &quot;Invalid marks&quot;.
(ii)result based on per as follows:
70 to 100 ===&gt;Distinction
60 to &lt;70 ===&gt;FirstClass
50 to &lt;60 ===&gt;SecondClass
35 to &lt;50 ===&gt;ThirdClass
else ===&gt;Fail

*/
package CLASSASSIMENT;
import java.util.*;
class TotalMarks
{
    int total(int s1, int s2, int s3, int s4, int s5, int s6) 
    {
      return s1+s2+s3+s4+s5+s6;
    }
}

class Percentage
{
   float avg(int totalMarks) 
   {
     return (float)totalMarks/6;
   }
}

class Result
{
	String res(float avg,int s1,int s2, int s3, int s4, int s5, int s6)
	{		
	if(s1>=35&&s2>=35&&s3>=35&&s4>=35&&s5>=35&&s6>=35)
	{
		if(avg>=70 && avg<100)
		{
		return "Distinction";
		}
		else if(avg>=60 && avg<70)
		{
		return "FirstClass";
		}
		else if(avg>=50 && avg<60)
		{
		return "SecondClass";
		}
		else if(avg>=40 && avg<50)
		{
		return "ThirdClass";
		}
		else
		{
		return "F";
		}
	}
	else 
		return "FAIL ";
	}
}
class Results 
    {
	public static void main(String[] args)
    {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the 1st Subject:");
	int s1=s.nextInt();
	System.out.println("Enter the 2nd Subject:");
	int s2=s.nextInt();
	System.out.println("Enter the 3rd Subject:");
	int s3=s.nextInt();
	System.out.println("Enter the 4th Subject:");
	int s4=s.nextInt();
	System.out.println("Enter the 5th Subject:");
	int s5=s.nextInt();
	System.out.println("Enter the 6th Subject:");
	int s6=s.nextInt();
	
	if((s1>=0&&s1<=100)&&(s2>=0&&s2<=100)&&(s3>=0&&s3<=100)&&
			(s4>=0&&s4<=100)&&(s5>=0&&s5<=100)&&(s6>=0&&s6<=100))
	{	
	TotalMarks tm = new TotalMarks();
	int tot=tm.total(s1,s2,s3,s4,s5,s6);
	System.out.println("TOTAL MARKS="+tot);
	
	Percentage p=new Percentage();
	float per=p.avg(tot);
	System.out.println("Percentage="+per);
	
	
	Result re=new Result();
	String r=re.res(per, s1, s2, s3, s4, s5, s6); 
	System.out.println("RESULT="+r);
	}
	else 
	{
		System.out.println("invalid number");
	}
    }
	}
