/*Que-1)
______________
Create 2 classes : Book & MyBook

Define the Book class with following specifications :-

Book:
=====
	abstract class
                  Instance Variables: title : String
	Methods: setTitle(String): void : abstract , getTitle() :String
	
Create a sub classes of Book called MyBook.

Define the MyBook class with following specifications :-
Methods:
override setTitle from parent class.
        This method takes the book title as parameter and                 
       assigns it into the instance variable of parent class.
override getTitle from parent class.
This method returns the name of the book in the format mentioned below in Sample Output.
Sample Input
============
A tale of two cities

Sample Output
=============
The title of my book is : A tale of two cities

Note: 
=====
A class Testing is given to you with a main method. 
Use this class to test your solution's classes and methods.
*/
package test;
public abstract class Book {
       String title;
       
       public  abstract void  setTitle(String title);

	    public String getTitle() {
		return title;
	}

	
	
	
	
	
	
}
