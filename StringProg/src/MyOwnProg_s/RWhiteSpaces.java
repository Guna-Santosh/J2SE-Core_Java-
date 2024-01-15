package MyOwnProg_s;

public class RWhiteSpaces {
	public static void main(String[] args) {
      System.out.print("ENTER THE STRING = ");
      java.util.Scanner s=new java.util.Scanner(System.in);
      String str=s.nextLine();
      System.out.print(str.replaceAll("\\s", ""));
                  //< \\s is a space ascci >
      System.out.println();
      int le=str.length();
      for(int i=0;i<le;i++) 
      { 
    	   
    	  if(str.charAt(i)==' ') 
    	  {
    		  continue;
    	  }
    	  else 
    	  {
    		  System.out.print(str.charAt(i));
    	  }
      }
      s.close();
	}//end of main()
}//end of class
