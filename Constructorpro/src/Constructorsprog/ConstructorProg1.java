package Constructorsprog;

public class ConstructorProg1
{
	ConstructorProg1()//it excute 1st 
	{
		System.out.println("I'M CONSTRUCTUR,I WILL EXCUTE 1ST");
	}//END OF CONSTRUCTOR
	
	void notConstructor() 
	{
	System.out.println("TQ FOR CALLING ME 2ND IAM EXCUTE");	
	}//END OF NON CONSTRUCTOR
	
    public static void main(String[] args)
      {
	   ConstructorProg1 cp=new ConstructorProg1();
       cp.notConstructor();//BY USING OBJECT REFERANCE IAM CALLING METHOD
     }//END OF MAIN
}//END OF CLASS
