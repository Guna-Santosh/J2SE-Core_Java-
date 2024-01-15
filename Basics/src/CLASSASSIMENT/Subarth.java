package CLASSASSIMENT;
import java.util.*;
class Add
{
	int add(int a,int b) 
	{
	return a+b;
	}
}//class-1

class Sub
{
 int sub(int a,int b)
 { 
	 return a-b;
 }
}//class-2

class Mul
{
  int mul(int a,int b) 
  {
     return a*b;	
  }
}//class-3
class Div
{
  float div(int a,int b)
  {
	  return a/b;
  }
}
class Moddiv
{
  float moddiv(int a, int b)
  {
	  return a%b;
  }
}

class Subarth {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 2 values");
		int v1=s.nextInt();
		int v2=s.nextInt();
		System.out.println("******SELECT*******");
		System.out.println("1.Add\t2.Sub\n3.Mul\t4.Div\t\t\t\t\n5.Moddiv");
	    System.out.println("Select any one Opetion");
	int select=s.nextInt();
	s.close();
	switch(select)  
	{
	case 1:
		Add ad=new Add();
		int A=ad.add(v1, v2);
		System.out.println("Addition Of 2 Number:"+A);break;
	case 2:
        Sub su=new Sub();
		int S=su.sub(v1, v2);
		System.out.println("Substraction Of 2 Number:"+S);break;
	case 3:
		Mul mu=new Mul();
		int M=mu.mul(v1, v2);
		System.out.println("Multiplaction Of 2 Number:"+M);break;
	case 4:
		Div dv=new Div();
		float D=dv.div(v1, v2);
		System.out.println("Divided Of 2 Number:"+D);break;		
	case 5:
         Moddiv md=new Moddiv();
		 float Md=md.moddiv(v1, v2);
		 System.out.println("diverser Of 2 Number:"+Md);break;
		 
	}

}
}