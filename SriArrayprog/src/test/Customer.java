package test;

public class Customer
{
	public String id,name,city;
	public Contact ob;
   
	public Customer(Contact ob)// cunstruction with obj_ref
    {
    	this.ob=ob;
    }
}
