package assenments;

public class FindingVowles 
{
	 public static void main(String[] args) 
	   {
		 int c=0; 
	    java.util.Scanner s=new java.util.Scanner(System.in);//scanner class calling
	    System.out.print("enter name: ");
	    String name=s.nextLine();
	    System.out.print(name+" = ");
	    
	    int le=name.length();//storing size of string into variable (le)
	    
	    for(int i=0;i<=le-1;i++)
	    {
    	char ch=name.charAt(i);//saving each letter in string into variable (ch)	        
	        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	    	{
	    		c++;
	    		System.out.print(ch+" ");
	    		
	    	}//end of if
	    }//end of 1st for loop
	    System.out.println("\ncount of the vowels = "+c );
	    s.close();
	   }//end of main 
}//end of class
