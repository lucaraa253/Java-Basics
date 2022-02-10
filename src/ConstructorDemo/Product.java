package ConstructorDemo;

public class Product {
	
	int productId;
	String productName;
	int quantityOnHand;
	int price;
	int star=5;
	
	
//	Constructor - used to initialize
	public Product() {
		productId = 100;
		productName = "Nick";
		quantityOnHand = 100;
		price = 99;
		System.out.println("Product Constructor Called");
	}
	
	
	
	public Product(int productId, int price, int star) {
		this();
		this.productId = productId;
		this.price = price;
		this.star = star;
	}



	public Product(int productId, String productName, int quantityOnHand, int price, int star) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.quantityOnHand = quantityOnHand;
	this.price = price;
	this.star = star;
}



	public void printProductDetails() {
//		Below this will print star = 4 since it is a local variable -
		int star = 4;
		System.out.println("Product ID : " + productId);
		System.out.println("Product Name : " + productName);
		System.out.println("Quantity on hand : " + quantityOnHand);
		System.out.println("Price : " + price);
		System.out.println("Stars : " + star);
	}

	public static void main(String[] args) {
		System.out.println("------------Product 1");
		Product product = new Product();
		product.printProductDetails();
		System.out.println("--------------Product 2");
		Product product2 = new Product(2, "Aroma", 12, 99, 3);
		product2.printProductDetails();
		System.out.println("--------------Product 3");
		Product product3 = new Product(1,2,3);
		product3.printProductDetails();
		
	}

}
