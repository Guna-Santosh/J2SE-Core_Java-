/*Program-4

There are 10 boys and 10 girls sitting in opposite rows. 
Leave the first boy and girl, 
pick the boy sitting in even position, and 
girl sitting in odd position, 
and form a pair for dance competition.
Write a method that iterates over 10 boys and 10 girls and 
form a pair based on above condition.
This should be applicable for number of boys/girls 
which is equal to multiple of 10
pairForDanceCompetition(number of boys/girls in a row)-> 
(b2,g3), (b4,g5), (b6,g7),(b8,g9)
*/package codes;

public class Prog4_sittingArrangements {

	//String 
	void pairForDanceCompetition(int n) 
	{String s="";int j;
	    for(j=1+1;j<n;j++) 
	    {
	    	if(j%2==0)System.out.print("(b"+j); //s=s+"(b"+j;
	    	if(j%2!=0) System.out.print(","+j+"g)");//s=s+",g"+j+")"+" ";
	    }
		//return s;
	}
	public static void main(String[] args) {
		Prog4_sittingArrangements sa=new Prog4_sittingArrangements();
	    //System.out.println(sa.pairForDanceCompetition(10));
		sa.pairForDanceCompetition(10);
	}

}
