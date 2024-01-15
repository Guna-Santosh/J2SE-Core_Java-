package pistring;
public class CapitalOfFL {

	public static void main(String[] args) {
		String s="santosh guna deep rocky";String em="";
		
		String st[]=s.split(" ");
		for(String s1:st)
		{
			String fl=s1.substring(0,1);
			String ml=s1.substring(1,s1.length()-1);
			String ll=s1.substring(s1.length()-1);
			em+=fl.toUpperCase()+ml+ll.toUpperCase()+" ";
		}
		System.out.println(em);	
	}

}
