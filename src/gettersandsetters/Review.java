package gettersandsetters;

public class Review {
	private int reviewId;
	private String reviewGivenBy;
	private int rating;
	
	public void review() {
		reviewId = -1;
		reviewGivenBy = "Not available";
		rating = -1;
	}

	public Review(int reviewId, String reviewGivenBy, int rating) {
		super();
		this.reviewId = reviewId;
		this.reviewGivenBy = reviewGivenBy;
		this.rating = rating;
	}

	public Review(int reviewId, String reviewGivenBy) {
		super();
		this.reviewId = reviewId;
		this.reviewGivenBy = reviewGivenBy;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public String getReviewGivenBy() {
		return reviewGivenBy;
	}

	public void setReviewGivenBy(String reviewGivenBy) {
		this.reviewGivenBy = reviewGivenBy;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
