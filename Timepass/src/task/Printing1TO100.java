package task;

import java.util.BitSet;

@SuppressWarnings("serial")
public class Printing1TO100 {

	public static void main(String[] args) 
	{
	String set=new BitSet()   
	{
		{
			set(1,101);
		}
	}.toString();
	System.out.append(set,1,set.length());
	}

}
