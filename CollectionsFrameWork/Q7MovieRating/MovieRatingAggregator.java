package CollectionsFrameWork.Q7MovieRating;

import java.util.*;

public class MovieRatingAggregator {

    private Map<String, List<Integer>> ratingsMap = new HashMap<>();

    public void addRating(String movie, int rating) {
        if (rating < 1 || rating > 5) {
            System.out.println("Invalid rating for " + movie);
            return;
        }

        ratingsMap.computeIfAbsent(movie, k -> new ArrayList<>()).add(rating);
    }

    public void printAverageRatings() {
        Map<String, Double> avgRatings = new HashMap<>();

        for (Map.Entry<String, List<Integer>> entry : ratingsMap.entrySet()) {
            List<Integer> ratings = entry.getValue();
            double avg = ratings.stream().mapToInt(Integer::intValue).average().orElse(0.0);
            avgRatings.put(entry.getKey(), avg);
        }

        avgRatings.entrySet().stream()
                .sorted((e1, e2) -> Double.compare(e2.getValue(), e1.getValue())) // Descending
                .forEach(entry -> System.out.printf("%s: %.2f%n", entry.getKey(), entry.getValue())); //Print upto 2 decimal place
    }
}

