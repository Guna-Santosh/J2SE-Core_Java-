package inLabPro;

public class Tester extends Student
{
  public static void main(String[] args) 
  {
	 java.util.Scanner s=new java.util.Scanner(System.in);
	 int studentId=s.nextInt();
	 String studentName=s.nextLine();
	 int marks=s.nextInt();
	
	 Student st=new Student();
     System.out.println(st.displayDetails());
	
	
  }//end of main
}//end of class
