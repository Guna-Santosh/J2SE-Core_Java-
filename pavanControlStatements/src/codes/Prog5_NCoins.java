/*Program-5
There are 20 bottles and in each bottle, there are 100 coins.
Pick 1 coin from 1st bottle, 
     2 coins from 2nd bottle, 
     3 coins from 3rd bottle 
and  20 coins from 20th bottle and calculate the sum
Write a method that computes sum of coins from
the number of coins picked up from 1st bottle, 
2nd bottle till nth bottle

sumOfCoins(20) -> 210
*/package codes;

public class Prog5_NCoins {
	void sumOfCoins(int coins) 
	{int sum=0;
		for(int i=1;i<=coins;i++){
			sum=sum+i;
		}
		System.out.println("sumOfCoins("+coins+")->"+sum);
	}
public static void main(String[] args) {
	Prog5_NCoins nc=new Prog5_NCoins();
	nc.sumOfCoins(20);
    }
}
