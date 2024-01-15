package LABPROG;

public class prog10_es_os_ec_oc {

	public static void main(String[] args) 
	{   System.out.print("a[i] size = ");
	   java.util.Scanner s=new java.util.Scanner(System.in);
	   int size=s.nextInt();int e = 0,o = 0;
	   int a[]=new int[size];
	   int ev[]=new int [size];
	   int od[]=new int[size];
	   for (int i = 0; i < a.length; i++) 
	   {
		    a[i]=s.nextInt();
	   }
		/*for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}*/// System.out.println();
	   int k=0,l=0;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2==0) 
			{ 
				ev[k]=a[i];e++;
				  k++;
            }
			else
			  {
				od[l]=a[i];o++;
			       l++;
			   }
		}System.out.println(e+" "+o);
		
		for(int i=0;i<ev[i];i++) 
		{
			System.out.print(ev[i]+" ");
		}System.out.println();
		for(int i=0;i<od[i];i++) 
		{

            System.out.print(od[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
