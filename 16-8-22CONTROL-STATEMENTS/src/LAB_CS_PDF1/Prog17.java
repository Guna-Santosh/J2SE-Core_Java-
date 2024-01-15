/*
Program-17
Define a method which accepts 2 numeric 
arguments and returns a box of the same size 
as a string with asterisk '*' symbol.
Write the method with following specifications
Name of method : createBoxPattern
Arguments: 2 Integer Arguments 
// 1st argument represents Number of Rows.
// 2nd argument represents Number of Columns.
Return Type: A String value
Value must not be negative. 
If yes, then return -1 as string.  
 Value must not be 0. 
 If yes, then return -2 as string.
 1st value is rows and 2nd value is columns.
Box must be created using star symbol 
separated using a single blank space
For example, 1st value=4 & 2nd value=5 
then output must be:-        
 *  *  *  *  *
 *           *
 *           *
 *  *  *  *  **/
package LAB_CS_PDF1;

public class Prog17 {
String createBoxPattern(int a,int b)
  {  String s ="";
	if(a<0||b<0)
		return "-1";
	else if(a==0||b==0)
	return "-2";
	else 
	{ 
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=b;j++) 
			{
				if(i==1||i==5||j==1||j==5)
					s=s+"* ";
			else 
					 s=s+"  ";
			}
			 s+="\n";
		}
		return s;
	}
	
	
  }
 public static void main(String[] args) {
	Prog17 obj=new Prog17();
System.out.println(obj.createBoxPattern(5,5));
}
}

