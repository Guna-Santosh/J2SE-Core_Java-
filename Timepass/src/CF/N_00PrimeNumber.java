package CF;
public class N_00PrimeNumber {
	public static void main(String[] args) {
												//		int a=10,b=20;
		for(int i=10;i<=20;i++) 
		{	int c=0;
			for(int j=1;j<=i;j++) 
			{
				if(i%j==0) c++;
//				System.out.println(j);
			}
			if(c==2)
				System.out.println(i);
		}
	}

}
