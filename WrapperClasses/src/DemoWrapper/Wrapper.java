package DemoWrapper;
public class Wrapper 
{   @SuppressWarnings( "removal")
	public static void main(String[] args)  {
    	 System.out.println("     ****BOXING PROCESS****");
  /*the process of binding/converting premitive datatypes into wrapper classes objects.
         BOXING PROCESS*/
      //----------------------------------------------------------------------------
    /*the pre-defined class from java.lang package which are used to make 
    primitive data types avalible in the form of object are known as wrapper class*/
       System.out.println("------AFTER BOXING PROCESS-----");
       Integer obi=new Integer(12); //integer is a per-defined class 
	   Integer obis=new Integer("182");  
	   Float obf=new Float(17.9f);
	   Float obfs=new Float("12.3f");
	   Float obd=new Float(13.6);   
	   Character obc=new Character('s');
	   Boolean obb=new Boolean(true);
	   Boolean obbs=new Boolean("false");
	   Byte obB=new Byte((byte)99);
	   Short obS=new Short((short)143);
	   Long obL=new Long(74L);
	   
	   System.out.println("DISPLAY DATA FROM OBJECTs\n");
	   System.out.println("1.integer   = "+obi); //tostring also work automatically
	   System.out.println("2.float     = "+obf); 
	   System.out.println("3.double    = "+obd); 
	   System.out.println("4.character = "+obc);
	   System.out.println("5.boolean   = "+obb); 
	   System.out.println("6.byte      = "+obB);
	   System.out.println("7.short     = "+obS); 
	   System.out.println("8.long      = "+obL);
	   
	   System.out.println("\ni-string  = "+obis); 
	   System.out.println("f-string  = "+obfs); 
	   System.out.println("b-string  = "+obbs); 
	   System.out.println("\n--------************--------");
	   
	   
//*********************************************************************************************************	   
	   System.out.println("\n    ****UNBOXING PROCESS****");
	   //THE PROCESS OF TAKING PRIMITIVE DATA TYPES OUTOF WRAPPER CLASS OBJECT.
	      //boxing process
	   System.out.println("----AFTER UNBOXING PROCESS----");
	   System.out.println("DISPLAY THE DATA");
	  
	   Integer ob1=new Integer(999);
	   Float ob2=new Float(76.4f);
	   Character ob3=new Character('a');
	   Boolean ob4=new Boolean(true);
	   Byte ob5=new Byte((byte)5);
	   Short ob6=new Short((short)9);
	   Long ob7=new Long(5L);
	   Double ob8=new Double(55.2); 
	      //unboxing process
	   
	   int i=ob1.intValue();// we have pre-defined methods to unboxing
	   float f=ob2.floatValue();
	   char c=ob3.charValue();
	   boolean b=ob4.booleanValue();
	   byte by=ob5.byteValue();
	   short sh=ob6.shortValue();
	   long lo=ob7.longValue();
	   double d=ob8.doubleValue();
	   
	   
	   System.out.println("1.ub int     = "+i);
	   System.out.println("2.ub float   = "+f);
	   System.out.println("3.ub char    = "+c);
	   System.out.println("4.ub boolean = "+b);
	   System.out.println("5.ub byte    = "+by);
	   System.out.println("6.ub short   = "+sh);
	   System.out.println("7.ub long    = "+lo);
	   System.out.println("8.ub double  = "+d);
	  
	   
	   
	   
	   
	   
	   //the boxing which is perform autometically is known as autoboxing
	   
	   
	   
	}
}
