/*Que-2)
===========================
A abstract class "Cake" is given. Create a subclass called OrderedCake. 
And check the working of it.

Meet the following requirements.

Modifiers of the class Cake : abstract, public 

Attributes:
	Attribute Name : shape  Type:String  Modifier:private
	Attribute Name :flavour Type:String  Modifier:private
	Attribute Name :qty     Type:int     Modifier:private
	Attribute Name :price   Type:float   Modifier:private

Constructor:(One only)
	Modifier : protected
	type : With 3 parameters shape,flavour,qty in the same order.

Methods :
	Define setters and getters for all fields with
	 protected Modifier/Access specifier
	
	Name of the method : showCake	
	Return Type : void
	Modifier : Protected. 
	Task : It must print data as per below format/example.
	"A Round Vanilla Cake Of 2 Kg/Kg's Ready @ Rs.800/-"
	
Create an inherited class "OrderedCake". Inherit this from "Cake"
Define the following for the "OrderedCake" class

Attributes:
	Attribute name : message
	Type	 : String
	Modifier :private

Constructors:(3 only)
	Default Constructor : Ensure shape is Round, flavour is Vanilla
		and qty is 1 kg and price is 400.
Parameterized public Constructor :  For shape,flavour,qty
	Parameterized public Constructor :  For shape,flavour,qty and message.	
	Price is to be dynamically changed @400 per Kg.

Methods :
	Name of Method : showCake() - Override this
	Return type : void
	Modifier : public 
	
	Task :Print the following if message is not null or empty
	"A Round Vanilla Cake of 2 Kg/Kg's ready with
	 message Happy Birth Day @ Rs.800/-". 
	 Other wize display the message from superclass.


Create CakeMain class to test the working of the above.*/
package test;

public class Customer {
	public static void main(String[] args) {
		Ordercake oc=new Ordercake("Triangle","Red valvet",5,"hbd");
		oc.showCake();
		
	}

}
