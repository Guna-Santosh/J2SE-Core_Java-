package p2;
public class ArithmeticMainClass 
{
  public static void main(String[] args) 
  {
	java.util.Scanner s=new java.util.Scanner(System.in);  
	System.out.print("ENTER NAME : ");
	String k=s.nextLine().toUpperCase();
	
	System.out.println("****CHOICE ONE BRANCH****");
	System.out.println("CSE\nEEE\nECE");
	String a=s.nextLine().toUpperCase();
	System.out.println("YOU CHOOSE = "+a.toUpperCase());
	
	p1.CheckBranch cb=new p1.CheckBranch();
	System.out.println(cb.chebra(a.toUpperCase()));
	
	if(cb.chebra(a)==true) 
	{	
	p1.TotalMarks tm=new p1.TotalMarks();
	System.out.println("ENTER 1ST SUBJECT MARKS");
	int s1=s.nextInt();
	System.out.println("ENTER 2ND SUBJECT MARKS");
	int s2=s.nextInt();
	System.out.println("ENTER 3RD SUBJECT MARKS");
	int s3=s.nextInt();
	System.out.println("ENTER 4TH SUBJECT MARKS");
	int s4=s.nextInt();
	System.out.println("ENTER 5TH SUBJECT MARKS");
	int s5=s.nextInt();
	System.out.println("ENTER 6TH SUBJECT MARKS");
	int s6=s.nextInt();
	if((s1>=0&&s1<=100)&&(s2>=0&&s2<=100)&&(s3>=0&&s3<=100)&&
	   (s4>=0&&s4<=100)&&(s5>=0&&s5<=100)&&(s6>=0&&s6<=100))
	{
	if(s1<35||s2<35||s3<35||s4<35||s5<35||s6<35) 
	{
		System.out.println("SFAIL");
	}//end of if(s1<35
	else 
	{
	int tot=tm.totmarks(s1,s2,s3,s4,s5,s6);
	  System.out.println("ALL SUBJECTS PASS");
	System.out.println("STUDENT NAME IS : "+k);
    System.out.println("TOTAL MARKS = "+tot);
  p1.Percentage p=new p1.Percentage();
  System.out.println(p.per(tot, s1, s2, s3, s4, s5, s6));
  
  
	}//end of else
	}
	else 
	{
		System.out.println("INVALID MARKS");
	}
	}//end of if(true
	else 
	{
		System.out.println("INVALID BRANCH NAME");
	}
	
	
  }//end of main
}//end of class
