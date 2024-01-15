package assenments;

public class palindrome {
	 static char NN,RN;
	 public static void main(String[] args) 
	 { 
	 	System.out.print("enter name : ");
	 	java.util.Scanner s=new java.util.Scanner(System.in);
	 	String name=s.nextLine();   
	 	int le=name.length();
	 	 System.out.print("normal name = ");
	 	
	 	 for(int i=0;i<=le-1;i++)
	 	{
	 		 NN=name.charAt(i);
	 		System.out.print(NN);				
	 	}//end of 1st for
	 	
	 	 System.out.print("\nreverse name = ");
	 	for(int i=le-1;i>=0;i--)
	 	{
	 		RN=name.charAt(i);
	 		System.out.print(RN);
	 	}//end of 2nd for
	 	if(NN==RN)
	 		
	 	System.out.println("\npalindrom");
	 	else
	 		System.out.println("\nnot palindrome");

	 	s.close();
	 }//end of main
}//end of class
