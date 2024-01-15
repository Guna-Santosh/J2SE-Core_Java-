package pistring;

public class ToggleString {

	public static void main(String[] args) {
    String s="SaNtOsh";String Temp="";
    for(int i=0;i<s.length();i++) {
    	if(Character.isLowerCase(s.charAt(i)))
    	{   
    		Temp=Temp+Character.toUpperCase(s.charAt(i));
    	}else
    		Temp=Temp+Character.toLowerCase(s.charAt(i));
	}
	System.out.println(Temp);
	}
}
