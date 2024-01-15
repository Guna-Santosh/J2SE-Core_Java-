package pistring;
public class CountNumber {
	public static void main(String[] args) 
	{
		String s="2apples4mangoes";int sum=0;
//		for(int i=0;i<s.length();i++) 
//		{
//			if(Character.isDigit(s.charAt(i)))
//			sum+=Character.getNumericValue(s.charAt(i));
//		}
//		System.out.println(sum);
	//--------------------------------------------------------
	int c = 0;
	for(int i=0;i<s.length();i++) 
	{ 
		if(s.charAt(i)>='0'&&s.charAt(i)<='9')
		{   c++;
			sum+=s.charAt(i)-'0';
		}
	}
	System.out.println("sum = "+sum+" \nNo = "+c);
	}

}
