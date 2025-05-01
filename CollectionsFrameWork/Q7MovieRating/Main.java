package CollectionsFrameWork.Q7MovieRating;

public class Main {
    public static void main(String[] args) {
        MovieRatingAggregator aggregator = new MovieRatingAggregator();

        aggregator.addRating("Inception", 5);
        aggregator.addRating("Inception", 4);
        aggregator.addRating("Interstellar", 5);
        aggregator.addRating("Interstellar", 5);
        aggregator.addRating("Tenet", 3);
        aggregator.addRating("Tenet", 2);

        aggregator.printAverageRatings();
    }
}

