/*Program-8)
----------
Class Bowler is given to you. Add below details to the class
1. Instance variables:
	name: String,
	wickets: int,
	matches: int,
	balls_bowled: int,
	runs_conceded: int.
2. Create a default constructor that assigns default values to instance variables.
3. Create parameterized constructor that accepts name, wickets, matches, balls_bowled, runs_conceded.
4. Create below methods,
Method name: computeBowlingAverage
Return type: void
This method should print the bowling average of the bowler by dividing runs_conceded with wickets.
Output: 
Name: Sachin
bowling_avg=46.3
Note: 
a. If any  values are negative print 'Error'.
b. If runs_conceded or balls_bowled are greater than 0 when matches are 0 print 'Error'.

Method name: showStatistics
Return type: void
This method should print the details of the batsman.
Output: 
Name=Sachin
wickets=10
matches=5
balls_bowled=750
runs_conceded=463
Note: 
a. If any  values are negative print 'Error'.
b. If runs_conceded or balls_bowled are greater than 0 when matches are 0 print 'Error'.
Method name: computeStrikeRate
Return type: void
This method should print the Strike Rate of the bowler by dividing runs_conceded with balls_bowled.
Output: 
Name: Sachin
Strike_rate=0.61733335
Note: 
a. If any values are negative print 'Error'.
b. If runs_conceded or balls_bowled are greater than 0 when matches are 0 print 'Error'.

Given a class Testing that contains main method. Use this class to test your code.
*/
package test;

public class Testing extends Bowler
{
	Testing()
	{
	super("santosh",10,12,500,1000);
	}
	public static void main(String[] args) {
	Testing ts=new Testing(); 
	   ts.computeBowlingAverage();
	   ts.showStatistics();
	   
	 
}
   
}
