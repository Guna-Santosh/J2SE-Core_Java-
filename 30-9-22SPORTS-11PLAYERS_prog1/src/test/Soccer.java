package test;
import java.util.Scanner;
public class Soccer extends Sports
{
	String getName(String p)
	{
		return "cricket";
	}
	 String getNameOfTeamMember()
	    {
	    	return "each team has n player in sports";
	    }
	
  public static void main(String[] args) 
  {
	
	System.out.print("enter the sports = ");
	Scanner s=new Scanner(System.in);
	String p=s.nextLine();
	System.out.print("enter the players = ");
	int n=s.nextInt();
	
	Soccer sr=new Soccer();
	String sports=sr.getName(p);
	System.out.println(sr.getNameOfTeamMember()+" "+sports);
	
	s.close();
  }//end of main()
}//end of class
