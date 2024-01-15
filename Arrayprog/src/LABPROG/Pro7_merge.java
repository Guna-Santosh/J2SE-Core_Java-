package LABPROG;
public class Pro7_merge {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
        java.util.Scanner s=new java.util.Scanner(System.in);
         System.out.print("a[i] size = ");
         int size=s.nextInt();
         int c[]=new int[50];
         Integer a[]=new Integer[size];
        for (int i = 0; i < size; i++) 
        {
		     a[i]=new Integer(s.nextInt());	
		}
        
        System.out.print("b[i] size = ");
		int size1=s.nextInt();
        Integer b[]=new Integer[size1];
        for (int i = 0; i < size1; i++) 
		{
		     b[i]=new Integer(s.nextInt());
		}
        
        System.out.print("a[i] elements = ");
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
        
		System.out.print("\nb[i] elements = ");
		for(int i=0;i<size1;i++)
		{
			System.out.print(b[i]+" ");
		}
		
        System.out.print("\nMERGE OF ARRAY a[i] || b[i] = ");
		for(int i=0,j=0;i<size1+size;i++) 
		{
			if(i<size)
			{
			  c[i]=a[i]; 
			}
			else
  		    {
			  c[i]=b[j];
			  j++;
	 	    }
			System.out.print(c[i]+" ");
	   }
 s.close();
 }

}
