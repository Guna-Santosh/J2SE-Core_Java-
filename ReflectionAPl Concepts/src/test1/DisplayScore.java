package test1;

public class DisplayScore {
	
	private int battingScore =144;
	private double remaningOver =2.2;
	
	
	@Override
	public String toString() {
		return "About Match Details [battingScore=" + battingScore + ", remaningOver=" + remaningOver + ", Winners"+"]";
	}


	public void battingScore() {
	  System.out.println("battingScore = "+battingScore);	
	}
	
	
	public void remaningOver() {
		System.out.println("remaningOver = "+remaningOver);
	}
	
	public void aboutMatch() {
		System.out.println("Winners");
	}
	
}
