package Labpdf1;
public class Prog70_EachWordReverse 
{
//      String reverse(String s1) 
//      {  
//    	  String s2="";
//    	  String s3="";
//    	  for(int i=0;i<s1.length();i++)
//    	  {
//    		  if(s1.charAt(i)==' ')
//    		  {
//    		    s3=s3+s2+s1.charAt(i);
//    		    s2="";
//    		  }
//    	    s2=s1.charAt(i)+s2;
//    	  }
//    	  return s3+s2;
//      }
        //--------MODEL-2----------
      
      String reverse(String s1) 
      { 
            StringBuffer m=null;
    	    String[] str=s1.split(" ");
    	    for(String g:str)
    	    { 
    	      m=new StringBuffer(g);
    	      System.out.print(m.reverse()+" ");m=null;
    	    }
			return "";
			
      }
	public static void main(String[] args) 
	{
		Prog70_EachWordReverse ew=new Prog70_EachWordReverse();
	    System.out.println(ew.reverse("java is super"));	
    }
}
