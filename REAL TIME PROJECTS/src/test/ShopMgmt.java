package test;
import java.util.Scanner;

	public class ShopMgmt {
		static double totalBill=0;
		int prodId;
		String productName;
		double price,total;
		float quantity;
		ShopMgmt(int id, String name, double price){
			this.prodId=id;
			this.productName=name;
			this.price= price;
		}
		static void displayItem(ShopMgmt item) {
			System.out.println("Product Id: "+item.prodId);
			System.out.println("Product Name: "+item.productName);
			System.out.println("Product Price: "+item.price);
		}
		static void purchaseItem(ShopMgmt item,float quantity) {
			item.quantity= quantity+item.quantity;
			item.total = item.quantity*item.price;
		}
		static void bill(ShopMgmt item) {
			totalBill=totalBill+item.total;
			System.out.println(item.prodId+"\t"+item.productName+"\t"+item.price+"\t"+item.quantity+"\t\t"+item.total);
		}
		
		public static void main(String[] args) {
			ShopMgmt product1 = new ShopMgmt(1, "Mango",69.00);
			ShopMgmt product2 = new ShopMgmt(2, "Apple",30.00);
			ShopMgmt product3 = new ShopMgmt(3, "Banana",55.00);
			ShopMgmt product4 = new ShopMgmt(4, "Grapes",80.00);
			
			System.out.println("Product Id\tName\tPrice");
			System.out.println("-----------------------------");
			System.out.println(product1.prodId+"\t\t"+product1.productName+"\t"+product1.price);
			System.out.println(product2.prodId+"\t\t"+product2.productName+"\t"+product2.price);
			System.out.println(product3.prodId+"\t\t"+product3.productName+"\t"+product3.price);
			System.out.println(product4.prodId+"\t\t"+product4.productName+"\t"+product4.price);
			
			char ch='y';
			do {
				int id;
				float quantity;
				System.out.print("Enter Item Code: ");
				Scanner sc= new Scanner(System.in);
				id= sc.nextInt();
				if(id==product1.prodId) {
					displayItem(product1);
					System.out.print("Item Quantity: ");
					quantity= sc.nextFloat();
					purchaseItem(product1,quantity);
				}
				else if(id==product2.prodId) {
					displayItem(product2);
					System.out.print("Item Quantity: ");
					quantity= sc.nextFloat();
					purchaseItem(product2,quantity);
				}
				else if(id==product3.prodId) {
					displayItem(product3);
					System.out.print("Item Quantity: ");
					quantity= sc.nextFloat();
					purchaseItem(product3,quantity);
				}
				else if(id==product4.prodId) {
					displayItem(product4);
					System.out.print("Item Quantity: ");
					quantity= sc.nextFloat();
					purchaseItem(product4,quantity);
				}
				System.out.println("Do you want Purchase more Item[Y/N]");
				ch= sc.next().charAt(0);
			}while(ch=='y' || ch=='Y');
			System.out.println("Id\tName\tPrice\tQuantity   Net Price");
			System.out.println("----------------------------------------------");
			if(product1.quantity!=0) {
				bill(product1);
			}
			if(product2.quantity!=0) {
				bill(product2);
			}
			if(product3.quantity!=0) {
				bill(product3);
			}
			if(product4.quantity!=0) {
				bill(product4);
			}
			System.out.println("---------------------------------------------------");
			System.out.println("\t\t\t\tSub Total: "+totalBill);
		}
	}
	
	
	
	
	
	

