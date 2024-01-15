/* BY USING CONSTRUCTOR VOTING AGE */
package Constructorsprog;
public class Constructorsprog3 
{   
	int elgible;//instance verable 
	
	Constructorsprog3(int age)
	{
	 elgible = age;//
	}//end of constructor
	void isElgible(int user_age) 
	{
		if(user_age>=elgible) //22 is more then 18
		{
			System.out.println("elgible for voting");
		}//22>18 it excute >18
		else 
		{
			System.out.println("not elgible for voting");
		}//22<18 it excute <18
	}//end of isElgible
	
      public static void main(String[] args) 
      {
    	 java.util.Scanner s=new java.util.Scanner(System.in);
    	 System.out.println("ENTER THE AHE OF USER");
    	 int user_age=s.nextInt();
        
    	 Constructorsprog3 va=new Constructorsprog3(18);
       //giving age =18 value fix age bcz of elgible for voting 
	      va.isElgible(user_age);//user_age
        	s.close();
       }//end of main
}//end of class
