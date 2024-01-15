package test;

public abstract class Cake 
{
   private String shape;
   private String flavor;
   private int qty;
   float price;

protected Cake(String shape, String flavor, int qty) 
{	
	this.price=400*qty;
	this.shape = shape;
	this.flavor = flavor;
	this.qty = qty;
	
}

protected void showCake() 
{
	System.out.println("A "+ shape + flavor + " cake of " + qty+ "kg's is ready" + price);
}//end of showcake()

public String getShape() {
	return shape;
}

public void setShape(String shape) {
	this.shape = shape;
}

public String getFlavor() {
	return flavor;
}

public void setFlavor(String flavor) {
	this.flavor = flavor;
}

public int getQty() {
	return qty;
}

public void setQty(int qty) {
	this.qty = qty;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}
}//end of ab class
