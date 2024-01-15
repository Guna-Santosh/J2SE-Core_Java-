package test;

public class Ordercake extends Cake{

	private String message;

	public Ordercake() {
		super("ROUND","BUTTER SCOCH",2);
	}

	public Ordercake(String shape, String flavor, int qty) {
		super(shape, flavor, qty);
	}

	public Ordercake(String shape, String flavor, int qty,String message) {
		super(shape, flavor, qty );
		this.message=" HAPPY BIRTH DAY.... ";
	}

	
	protected void showCake()
	{ 
		if(message!=null) 
			
		System.out.println("A "+ getShape()+" "+ getFlavor() +" of " + 
	    	getQty() + " kg's ready with"+message+" @ Rs, " + getPrice()+"/-");
		
		else
		System.out.println("A "+ getShape()+" "+ getFlavor() + " of " +
		        getQty() + " kg's ready with @ Rs, " + getPrice()+"/-");
		
		}
	}


/*"A Round Vanilla Cake of 2 Kg/Kg's ready with message Happy Birth Day @ Rs.800/-".
Other wize display the message from superclass.*/


