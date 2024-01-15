/*Program-56
Create a method that accepts a String and checks if it is a positive string. A string is considered a positive string, if on moving from left to right each character in the String comes after the previous characters in the Alphabetical order. 
For Example 
ANT is a positive String (Since T comes after N and N comes after A) 
APPLE is not positive since L comes before P in the alphabetical order. 
The method should return true if the entered string is positive
Method Name 	checkPositive 
Argument 	String 
Return Type 	boolean 
Algorithm	Step 1: Convert to Char array. 
Step 2: Iterate through array, subtract 1st two characters (A-N). This will give the ASCII difference 
Step 3: If result is negative, then return false and break. Else continue to next loop 
*/package Labpdf1;

public class Prog56_Apple_Ant {
	boolean checkPositive(String s)
	{
		char a[]=s.toCharArray();
		for(int i=0;i<s.length()-1;i++)
		if(a[i]>a[i+1])
		return false;
		return true;      
		
	}
	public static void main(String[] args) {
		Prog56_Apple_Ant sp=new Prog56_Apple_Ant();
		System.out.println(sp.checkPositive("apple"));
	}
}
