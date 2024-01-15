package MyOwnProg_s;
public class RemoveSpecialChar_M1 {
   public static void main(String[] args) {  
	   java.util.Scanner s=new java.util.Scanner(System.in);
	   System.out.print("ENTER THE STRING = ");
       String str=s.nextLine();
      // System.out.println(str);
       String str2=str.replaceAll("[^a-zA-Z]"," ");
       System.out.println(str2);
       
       int le =str.length();
       for(int i=0;i<le;i++)
       {
    	 if(str.charAt(i)>='A'&&str.charAt(i)<='Z') 
    	System.out.print(str.charAt(i));
    	 else if(str.charAt(i)>='a'&&str.charAt(i)<='z') 
    	System.out.print(str.charAt(i));
    	// else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
    	//System.out.print(str.charAt(i));
    	
       
       }//end of 1st for loop	
    	
       
       s.close();
   }//end of main
}//end of class
