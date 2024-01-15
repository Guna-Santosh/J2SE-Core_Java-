/*Program-27
Define a method which accepts 3 values as number and checks
and returns the name of the type of triangle generated.
Write the method with the following specifications: 
Name of method findTriangle() 
Arguments: three arguments of type integers
Return Type: String value 
Specifications: The value returned by the 
method findTriangle() is determined by the following rules:
Values must not be 0. If yes, then return -1 as string.                                                              
Values must not be negative. If yes, then return       -2 as string.                                 
Sum of two sides must be greater than the third side.
If no, then return -3 as string

If it’s a triangle with valid sides,
then return as string whether the triangle formed is EQUILATERAL,
 ISOSCELES or SCALENE.
*/
package LAB_CS_PDF1;
public class Prog27 
{
	String findTriangle(int a,int b,int c)
	{   String str="";
		if(a==0||b==0||c==0)
			return "-1";
		else if(a<0||b<0||c<0)
		    return "-2";
		else if(a+b<c||b+c<a||c+a<b)
			return "-3";
		else if(a==b&&b==c&&c==a)
			str="EQUILATERAL";
		else if(a==b||b==c||c==a)		
		    str="ISOSCELES";
		else
			str="SCALENE";
		return str;
	}
	public static void main(String[] args)
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
	    System.out.print("ENTER THE A VALUE = ");
	    int a=s.nextInt();
	    System.out.print("ENTER THE B VALUE = ");
	    int b=s.nextInt();
	    System.out.print("ENTER THE C VALUE = ");
	    int c=s.nextInt();
	    Prog27 p=new Prog27();
	   System.out.println( p.findTriangle(a,b,c));
	    s.close();
	}//end of main()
}//end of class
