package test;

import test1.*;

public class Demo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception 
	{

		Object ob1 = Class.forName(args[0]).newInstance();
		System.out.println(ob1);

		Batting battingOb = (Batting) Class.forName(args[1]).newInstance();
		battingOb.teamMembers();
		System.out.println(battingOb);

		Bowling bowlingob = (Bowling) Class.forName(args[2]).newInstance();
		bowlingob.bowlingTeam();
		System.out.println(bowlingob);

		DisplayScore disscr = (DisplayScore) Class.forName(args[3]).newInstance();
		disscr.battingScore();
		disscr.remaningOver();
		disscr.aboutMatch();
		//System.out.println(disscr);
	}
}
