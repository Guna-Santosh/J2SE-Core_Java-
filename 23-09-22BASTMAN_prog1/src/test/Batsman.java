/*Program-2
----------
Class Batsman is given to you. Add below details to the class
1. Instance variables:
    name: String,
	runs: int,
	matches: int,
	batting_avg: float.
2. Create a default constructor that assigns default values to instance variables.
3. Create parameterized constructor that accepts name, runs, matches.
4. Create below methods,

Method name: computeBattingAverage
Return type: void
This method should print the batting average of the batsman by dividing run with matches.
Output: 
Name: Sachin
Batting_Avg: 38.87689
Note: 
a. If runs or matches values are negative print 'Error'.
b. If runs are greater than 0 when matches are 0 print 'Error'.



Method name: getStatistics
Return type: void
This method should print the details of the batsman.
Output: 
Name: Sachin
Runs: 18000
Matches: 463
Note: 
a. If runs or matches values are negative print 'Error'.
b. If runs are greater than 0 when matches are 0 print 'Error'.

Given a class Testing that contains main method. Use this class to test your code.
*/package test;
public class Batsman 
{
 String name;int runs,matches; float bating_avg;
public Batsman() {
}
public Batsman(String name, int runs, int matches) {
	this.name = name;
	this.runs = runs;
	this.matches = matches;
}  
void computeBattingAverage() 
{
	if(runs<0||matches<0||runs>0&&matches==0) 
	{
		System.out.println("error");
	}
	else 
	{
	float k=(float)runs/matches;
	System.out.println((k));
	}
}
void getStatistics() 
{
	if(runs<0||matches<0||runs>0&&matches==0) 
	{
		System.out.println("error");
	}
	else
	{
		System.out.println(name);
		System.out.println(runs);
		System.out.println(matches);
	}
}
 /* public static void main(String[] args) 
  {
	 Batsman bt=new Batsman("sant",9000,6);
	 bt.computeBattingAverage();
	 bt.getStatistics();
}//end of main()*/
}//end of class
