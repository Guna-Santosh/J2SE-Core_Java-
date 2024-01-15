/*Program-3
There are 20 students in a class, the teacher promised that 
if any of the students get more than 70%, he gives 3 pens to each of the student,
who get more than 60% and less than 70% he gives 1 pen to each of the student 
Write a method that takes % of the marks as input and 
return the number of pens based on the % marks
getNumberOfPens(0.68) -> 1
getNumberOfPens(0.8)-> 3

*/package codes;
public class Prog3_percentage
{
	int percentage(float marks) 
	{   int pen=0;
		if(marks>0.7) 
		{
			pen=3;
		}
		else pen=1;
		return pen;
	}
public static void main(String[] args) {
	Prog3_percentage p=new Prog3_percentage();
    System.out.println(p.percentage(0.68f));	
}
}
