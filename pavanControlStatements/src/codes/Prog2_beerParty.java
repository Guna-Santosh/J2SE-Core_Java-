/*Program-2
When bachelor's get together for a party,
they like to have beers. 
A bachelor party is successful when the 
number of beers is between 40 and 60, inclusive. 
Unless it is the weekend, in which case there is
no upper bound on the number of beers. 
Return true if the party with the given values is successful, 
or false otherwise.

public boolean beerParty(int beers, boolean isWeekend) {
}
beerParty(30, false) → false
beerParty(50, false) → true
beerParty(70, true) → true
beerParty(30, true) → false
*/package codes;

public class Prog2_beerParty 
{//@SuppressWarnings("unused")
	public boolean beerParty(int beers, boolean isWeekend) 
	{
		if(beers>40&&beers<60) 
		{
			 if(beers<=30 && isWeekend==false)
				return false;
			if(beers>50 && isWeekend==false)
				return true;
			if(beers<70 && isWeekend==true)
		        return true;
			if(beers<30 && isWeekend==true)
			    return false;
			//else return false;
		}
		return false;
	}
	public static void main(String[] args) {
		Prog2_beerParty bp=new Prog2_beerParty();
		System.out.println(bp.beerParty(28, true));
	}

}
