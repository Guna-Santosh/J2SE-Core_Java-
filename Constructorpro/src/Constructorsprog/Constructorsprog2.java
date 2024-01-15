package Constructorsprog;

public class Constructorsprog2 
{    int num;//instance variable
	 Constructorsprog2(int a)
	 {
		 num=a;
	 }//end of constructor
	 
	 void  showSq() 
	 {
		 System.out.println("SQUARE OF "+num+" IS "+num*num); 
	 }//end of showsq
	 
	 void showCb() 
	 {
	   System.out.println("CUBE OF "+num+" IS "+num*num*num);	 
	 }//end of showcb
	 
	public static void main(String[] args) 
	{
		Constructorsprog2 cp1=new Constructorsprog2(5);
		cp1.showSq();
		Constructorsprog2 cp2=new Constructorsprog2(4);
	    cp2.showCb();
	}//END OF MAIN
}//END OF CLASS
