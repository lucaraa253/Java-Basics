package gettersandsetters;

public class ShoppingApp {

	public static void main(String[] args) {
		Review review1 = new Review(101, "Nick", 5);
		review1.setRating(4);
		
		System.out.println(review1.getReviewGivenBy());
		System.out.println(review1.getRating());

	}

}
