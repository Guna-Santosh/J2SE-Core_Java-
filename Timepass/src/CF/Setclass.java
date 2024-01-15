package CF;

import java.util.*;


@SuppressWarnings({ "unchecked", "rawtypes" })
public class Setclass 
{
	//1.	don't allow duplicate  
	//2.    don't maintain order 
	//3.	it allow all 8 primative data types 

	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
     HashSet<Object> ob=new HashSet<Object>();
	     ob.add(new Integer(10));
	     ob.add(new Integer(120));
	     ob.add(new Integer(162));
	     ob.add(168);
	     ob.add(852);
	     ob.add(1254);
	     ob.add(1);
	     ob.add(12);
        System.out.println(ob);		 
	
        HashSet<Object> ob34=ob;
        
     
         
     
         
     Scanner s=new Scanner(System.in);
     HashSet ob11=new HashSet();
     
     int a=s.nextInt();     
     int b=s.nextInt();	
     int c=s.nextInt();	
     
     
     ob11.add(a);
     ob11.add(b);
     ob11.add(c);
     System.out.println(ob11);
	}

	
    
	
	
	
	
	
	
	
	
}

//     ob.add("sas");
//     ob.add('a');
//     ob.add(20.1);
//     ob.add(20.1f);
//     ob.add(true);
//     ob.add(true);
//     ob.add(null);