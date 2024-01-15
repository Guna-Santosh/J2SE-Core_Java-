package test;
class Student
{
	int sno;String name,grade;int cm,cppm,javam;
    int totmarks;float percent;
    

    void calculate() 
    {
         totmarks=cm+cppm+javam;	
         percent=(totmarks/300f)*100;

}//calculate
void decidegrade() 
{
	if((cm<40)||(cppm<40)||(javam<40))
		grade="fail";
	
	else 
	{
		if((totmarks>=250)||(totmarks<=300)) 
		    grade ="distinction";
		if((totmarks>=200)||(totmarks<=249)) 
		    grade ="first";
		if((totmarks>=150)||(totmarks<=199)) 
		    grade ="second";
		if((totmarks>=120)||(totmarks<=149)) 
		    grade ="third";
	}//else
	
	
	
}//decide
void dispmarksmemo() 
{
System.out.println("-----------");	
System.out.println("\tStudent marks report");
System.out.println("------------");
System.out.println("\tstudent sno:"+sno);
System.out.println("\tstudent name"+name);
System.out.println("\tstudent marks in C :"+cm);
System.out.println("\tstudent marks in C++ :"+cppm);
System.out.println("\tstudent marks in java :"+javam);
System.out.println("-------------------");
System.out.println("\tstudent totalmarks :"+totmarks);
System.out.println("\tpercentage pf marks :"+percent);
System.out.println(""+grade);
System.out.println("-------------------------");


}



}





public class Marks 
{

	public static void main(String[] args)
	{
		Student ss=new Student();
		ss.calculate();
		ss.decidegrade();
		ss.dispmarksmemo();
	}

}
