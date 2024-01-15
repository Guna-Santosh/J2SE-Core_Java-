/*Que-3)
A class Person having parametrs age int, name String, address Address

Another class Address is given to you with the following attributes:

	private : doorNo String, street String, city String
 
    Getter/Setter for all the attributes of COJ_57_Address

    Implement the public default constructor.

    Implement the public parameter constructor.
	
	Override toString() to return address data.
    
Note : Add a variable of COJ_57_Address class into COJ_57_Person class 
and create its object in COJ_57_Person class to hold the address data.

Create Overloaded Constructor in COJ_57_Person 
class in order to create an object without address.

A class COJ_57_PersonAddress is given with main() 
where you can create various objects and test them.

*/package test;

public class COJ_57_person 
{
        int age;String name;COJ_57_Address m;

		    public COJ_57_person(int age, String name,COJ_57_Address m) {
			this.age = age;
			this.name = name;
			this.m=m;
		}

		@Override
		public String toString() {
			return "COJ_57_person [age=" + age + ", name=" + name + ", ads=" + m + "]";
		} 
		
        
}
