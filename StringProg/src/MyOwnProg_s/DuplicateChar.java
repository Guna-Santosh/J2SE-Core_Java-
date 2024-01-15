package MyOwnProg_s;
import java.util.Scanner;
public class DuplicateChar {
public static void main(String[] args) {
	System.out.print("ENTER THE STRING = ");
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	Integer le=str.length();
	char[] ch=str.toCharArray();
	for(int i=0;i<le;i++) 
	{
		for(int j=i+1;j<le;j++) 
		{
			if(ch[i]==ch[j]) {
				System.out.print(ch[j]);
				break;
			}//end of if
		}//end of 2nd for loop
	}//end of 1st for loop
      s.close();
}//end of main()
}//end of class
