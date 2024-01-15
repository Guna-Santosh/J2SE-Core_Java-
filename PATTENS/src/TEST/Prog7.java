package TEST;

public class Prog7 {

	public static void main(String[] args) {
for(int i=1;i<=4;i++) 
{
    for(int j=1;j<=4;j++) 
    {
    	if(i==j)
    	System.out.print("*");
    	else
    		System.out.print(" ");
    	
    }System.out.print("\n");	
}
for(int k=1;k<=4;k++) {
	for(int l=1;l<=4;l++) 
	{
	if(k+l==1)
		System.out.print("*");
	else
		System.out.print(" ");
	
	
	}System.out.print("\n");
	}

}
}
