package serviceConsumerProviderVis.onto;

import jade.content.Predicate;

public class ServiceRating implements Predicate {

	private static final long serialVersionUID = 1L;


	private int rating;

	public ServiceRating() {
	}

	public ServiceRating(int rating) {
		this.rating = rating;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
