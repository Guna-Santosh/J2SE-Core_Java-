package test;

public class CheckPinNo 
{
     public boolean verify(int pinno) 
       {
    	 return switch(pinno) 
    			 {
    	         case 1111:yield true;
    	         case 2222:yield true;
    	         case 3333: yield true;
    	         default : yield false;
    			 };
      }
}
