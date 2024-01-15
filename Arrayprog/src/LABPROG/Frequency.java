package LABPROG;
import java.util.Arrays;
public class Frequency {
	public static void main(String[] s1) {
//		int a=18482621;
		String sqw="hello world java hg hjf";
		char[] as=sqw.toCharArray();
		Arrays.sort(as);
		for(int i=0;i<as.length;i++) 
		{
			int c=0;
			for(int j=i;j<as.length;j++) 
			{
				if(as[i]==as[j])c++;
			}
			i=c+i-1; 
			System.out.println(as[i]+"->"+c);
		}
	}

}
