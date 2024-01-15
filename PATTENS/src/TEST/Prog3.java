package TEST;

public class Prog3 {
public static void main(String[] args) {
	System.out.println("3.prog");
    for(int i=5;i>=1;i--) 
	{
		for(int j=5;j>=1;j--) {
			if(i<=j)
				System.out.print("*");
			else
				System.out.print(" ");
	}System.out.print("\n");
	}
}
}
