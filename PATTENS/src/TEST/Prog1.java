package TEST;

public class Prog1 
{
   public static void main(String[] args) {
	 System.out.println("1. prog");
	for(int i=1;i<=5;i++) 
	{
		for(int j=1;j<=5;j++) 
		{
			
			if(i+j>=6)
				System.out.print("* ");/*"j"*//*"#"*/
			else
				System.out.print(" ");
			
	
		}		System.out.print("\n");
	}
	
	//System.out.println("-------------------------");
	for(int i=5;i>=1;i--) 
	{
		for(int j=5;j>=1;j--) {
			if(i-1>=j)
				System.out.print("* ");
			else
				System.out.print(" ");
	}System.out.print("\n");
	}
	
	
   }
}
