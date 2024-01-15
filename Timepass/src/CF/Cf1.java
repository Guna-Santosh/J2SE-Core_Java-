package CF;

import java.util.*;
public class Cf1 
{	
	public Cf1(int a, int age, int c, String s1, String s2, String s3) 
	{
		this.a = a;
		this.age = age;
		this.c = c;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	
	@Override
	public String toString() {
		return a+"  "+age+"  "+c+"  "+s1+"  "+s2+"  "+s3;
	}

	int a,age,c;String s1,s2,s3;
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
	   Scanner s=new Scanner(System.in);
	   Set ob=null;
		try(s;)
		{
			try 
			{
			while(true)
			{
		     System.out.println("*******choice*******");     
		     System.out.println("1.hashset"
				     		+ "\n2.linkedhashset"
				     		+ "\n3.treeset"
				     		+ "\n4.exit");     
		     
		     switch(s.nextInt()) 
		     {
		     case 1://hashset
		    	 ob=new HashSet();
		    	 System.err.println("\t"+ob.getClass());
		    	  break;
		     case 2://linkedhashset
		    	 ob=new LinkedHashSet();
		    	 System.err.println("\t"+ob.getClass());
		    	 break;
		     case 3://treeset
		    	 ob=new TreeSet();
		    	 System.err.println("\t"+ob.getClass());
		    	 break;
		     case 4:
		    	 System.err.println("\toperation is close");
		    	 System.exit(0);;
		    	 break ;
		     default :
		    	 System.err.println("\tinvalid selection");
		     }
		     //--------------------------------------------------------------------
		     abc:
		     while(true) 
		     {
		    	 System.out.println("choice");     
		    	 System.out.println("1.add()"
		    	 		        + "\n2.remove()"
		    	 		        + "\n3 display data"
		    	 		        + "\n4.exit");     
		    	 switch(s.nextInt()) 
		    	 {
		    	 case 1:
		    		int a=s.nextInt();
		    		int age=s.nextInt();
		    		int c=s.nextInt();
		    		String s1=s.next();
		    		String s2=s.next();
		    		String s3=s.next();
		    	 ob.add(new Cf1(a,age,c,s1,s2,s3) );	 
//		    	 ob.add(a );	 
//		    	 ob.add(b );	 
//		    	 ob.add(c );	 
//		    	 ob.add(s1 );	 
//		    	 ob.add(s2 );	 
//		    	 ob.add(s3 );	 
		    	 break;
		    	
		    	 case 2:
		    		  
		    		 
		    		 Iterator<Cf1> itob=ob.iterator();
		    		 System.err.println(ob.remove(itob));     
		    		 
		    		 
		    		 
		    		 
		    		 
		    		 break;

		    	 case 3:
		    		 if(ob.isEmpty()) 
		    		 {
		    			 System.out.println("-------EMPTY BOSS------");
		    		  }
		    		 else 
		    		 {
		    			 System.out.println("------foreachRemaining()---------------");
		    			 Spliterator sp=ob.spliterator();
		    		     sp.forEachRemaining((sp1)->
		    		     {
		    		    	 System.err.println(sp1);     
                         });
		    		     
		    		     System.out.println("------for each()---------------");
		    			 ob.forEach((p)->
		    		     {
		    			  System.err.println(p);     
		    		     });
		    		     
		    		 }
		    		 break;
		    	 
		    	 case 4:
		    	 System.out.println("operation is close");
		    	 System.exit(0);
		    	 break abc;
		    	 default :
		    		 System.out.println("invalid selection......");
		    		 
		    	 }
		     }
		     
		     
			}//end of while 16 line
			}
				catch(Exception e) {e.printStackTrace();}
				finally{ob=null;s.close();}
		}//end of 1st try(s;)
		
	}

}