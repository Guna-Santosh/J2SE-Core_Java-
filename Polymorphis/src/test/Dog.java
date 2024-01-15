package test;
//   STATIC POLYMORPHISM
public class Dog {
void eat() 
{
  System.out.println("i am dog");	
}
void eat(int a) 
{
  System.out.println(a);	
}
void eat(int a,int b) 
{
System.out.println(a);	
System.out.println(b);
}
	public static void main(String[] args)
	{
	Dog ob=new Dog();
	ob.eat();
	ob.eat(10);
	ob.eat(10, 20);
	
	
	}

}
