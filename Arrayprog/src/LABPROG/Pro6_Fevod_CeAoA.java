/*Program-06
Find even & odd element from an array 
and copy even element into even[] array 
and odd element into odd[] array.
*/package LABPROG;

public class Pro6_Fevod_CeAoA {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
	java.util.Scanner s=new java.util.Scanner(System.in);
    System.out.println("ENTER SIZE = ");	
	int size=s.nextInt();int j=0;
	Integer a[]=new Integer[size];
	Integer e[]=new Integer[size];
	Integer o[]=new Integer[size];
	
	for(int i=0;i<size;i++)
	{
		a[i]=new Integer(s.nextInt());
	    
	}
	System.out.print("EVEN e[i] elements = ");
	for(int i=0;i<size;i++) 
	{
		if(a[i]%2==0) {
		e[i]=a[i];
		System.out.print(e[i]+" ");}
	}System.out.print("\nODD o[i] elements = ");
	for(int i=0;i<size;i++) 
	{
		if(a[i]%2!=0) {
			o[i]=a[i];
			System.out.print(o[i]+" ");
		}
		
	}
	
	s.close();
	}

}
