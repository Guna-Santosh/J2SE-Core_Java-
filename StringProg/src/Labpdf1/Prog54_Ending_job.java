/*Program-54
You are asked to create an application for registering the 
details of jobseeker. 
The requirement is:userName should always end with _job and 
there should be atleast minimum of 8 characters to the left of _job.
Write a function to validate the same. 
Return true in case the validation is passed.
In case of validation failure return false.
Method Name 	validateUserName 
Argument 	String userName 
Return Type 	boolean 
*/package Labpdf1;
public class Prog54_Ending_job 
{
	boolean validateUserName(String userName) 
	{
		String ch="";
//		if(userName.length()<13)
//		for(int i=userName.length()-4;i<userName.length()-1;i++) 
//		{
//		   ch=ch+userName.charAt(i);	
//		}
//		if(ch.equals("_job"))
//		return true;
//		else return false;
		if(userName.length()==12) 
		{
			for(int i=userName.length()-4;i<userName.length();i++) 
			  {
				ch=ch+userName.charAt(i);
			  }
				if(ch.equals("_job"))
					return true;
		}
					return false;
				
	}
public static void main(String[] args) {
	Prog54_Ending_job sp=new Prog54_Ending_job();
	System.out.println(sp.validateUserName("santsh@_job"));
	


	
}
}//
