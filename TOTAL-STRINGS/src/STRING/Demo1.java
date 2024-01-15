package STRING;
public class Demo1 
{     
	public static void main(String[] args)
	{
       java.util.Scanner s=new java.util.Scanner(System.in);
       System.out.println("ENTER THE STRING");
       String s1=s.nextLine();//it is string literal process i.e( "hi" )
       System.out.println("toString is not used = "+s1);
       System.out.println(s1.toString());//it executed automatically when we dispaly ob_ref_value;
      //tostring() is auto excutable method.
       //System.out.println(s1.length);//error
       System.out.println(s1.length());
       // to find the length we have the pre-defined method is called length()
       //length keyword is used to find the array length.
       System.out.println("****display characte charAt()****");
      /* for(int i=0;i<s1.length();i++) 
       {
    	   char ch =s1.charAt(i);
    	   //charAt() 
    	   System.out.print(ch+" "); 
    	
       }*/
       System.out.println();
       for(int i=s1.length()-1;i>=0;i--) // if want to reverse a string paka -1;
       {
    	   char ch =s1.charAt(i);
    	   System.out.print(ch+" "); 
    	
       }
       
       
       
       
       
       s.close();

	}//end of main

}//end of class
