package Product;

public class ProductApp {
public static void main(String[] args) {
		Product product1 = new Product(1, "Lakme", 199, 99);
		Product product2 = new Product(1, "Lakme", 199, 99);
		
		System.out.println(product1);
		System.out.println(product1);
		Product product3 = product1;
		Product product4 = new Product(1, "Nick", 199, 99);

		System.out.println(product1.equals(product2));
		
		System.out.println(product1.getPrice());
		
		
		
		System.out.println(product1 == product2);
		
		System.out.println(product1.hashCode());
		System.out.println(product2.hashCode());
		System.out.println(product3.hashCode());
	}
}
