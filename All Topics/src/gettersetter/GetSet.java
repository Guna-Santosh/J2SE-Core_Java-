package gettersetter;
public class GetSet 
{
	int id;
	public int getId() {
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

//	public static void main(String[] args)
//	{
//		on.setId(12);
//		System.out.println(on.id);
//		
//	}

	
	
	
	public static void main(String args[]) {
        System.out.println("Main Method");
		GetSet on=new GetSet();
		main(new int[] {1,5,4});
		main(new char[] {1,5,4});
		main(new double[] {1,5,4});
		main(10.2f);
		
    }
    public static void main(int[] args){
        System.out.println("Overloaded Integer array Main Method");
    }
    public static void main(char[] args){
        System.out.println("Overloaded Character array Main Method");
    }
    public static void main(double[] args){
        System.out.println("Overloaded Double array Main Method");
    }
    public static void main(float args){
        System.out.println("Overloaded float Main Method");
    }
    
}
