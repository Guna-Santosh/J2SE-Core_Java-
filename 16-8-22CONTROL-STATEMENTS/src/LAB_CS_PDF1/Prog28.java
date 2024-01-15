/*Program-28
Define a method which accepts 2 values as number and returns the prime numbers between the values.
Write the method with the following specifications: 

Name of method: getPrimeNumbers() 
Arguments: two arguments of type integers
Return Type: String value 
Specifications: The value returned by the method getPrimeNumbers() 
is determined by the following rules:
Value must not be negative. If yes, then return -1 as string.                                                               
1st value must not be greater than or equal to 2nd value.
 If yes, then return -2 as string.                                       
Prime Numbers must be returned as one string with 
every value separated by single blank space.
*/
package LAB_CS_PDF1;
public class Prog28 {
	String getPrimeNumbers(int a,int b)
	{ String str="";
		if(a<0||b<0)
			return "-1";
		else if(a>=b)
			return "-2";
		else {
			for(int i=a;i<=b;i++) 
			{  
				int c=0;
				for(int j=1;j<=i;j++) 
				{
				if(i%j==0) c++;
			    }//end of 2nd loop
				if(c==2)
				{
					str=str+i+" ";
				
				}
			}//end of 1st loop
			
		}//end of else
		return str;
	}
	public static void main(String[] args) 
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
        System.out.print("ENTER THE \"a\" VALUE = ");
		int a=s.nextInt();
		System.out.print("ENTER THE \"b\" VALUE = ");
		int b=s.nextInt();
		Prog28 p=new Prog28();
		System.out.println(p.getPrimeNumbers(a, b));
		s.close();
	}//end of main()
}//end of class
