package TEST;

public class Prog6 {
public static void main(String[] args) {
	System.out.println("6.prog");
	for(int i=1;i<=5;i++) 
	{
		for(int j=5;j>=1;j--) {
			if(i>=j)
				System.out.print("* ");/*i+j+" "*/
			else
				System.out.print(" ");
	}System.out.print("\n");
	}
}
}
