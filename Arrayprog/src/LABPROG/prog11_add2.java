package LABPROG;

public class prog11_add2 
 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		System.out.print("ENTER a[i] size = ");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int size=s.nextInt();
		Integer a[]=new Integer[size];
		Integer b[]=new Integer[size];
		for(int i=0;i<size;i++) {
			a[i]=new Integer(s.nextInt());
		}
		for(int i=0;i<size;i++)
		{
			System.out.print((a[i]+2)+" ");
			
		}
	
	}
}
