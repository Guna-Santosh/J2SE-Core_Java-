package test;

public class Pro2_03_11_22 {
	String score(int runs, float overs) {
		float k = 0;
		if (runs >= 100) {
			k = runs / overs;
			return runs + " runs in " + overs + " overs" + " @ " + k + " runs per OVERS";
		} else {
			k = overs * 6;
			k = runs / k;
		}
		return runs + " runs in " + overs * 6 + " balls" + " @ " + k + " runs per BALLS";
	}
	public static void main(String[] args) {
		Pro2_03_11_22 sp = new Pro2_03_11_22();
		System.out.println(sp.score(58, 4.5f));
		// run
	}
}