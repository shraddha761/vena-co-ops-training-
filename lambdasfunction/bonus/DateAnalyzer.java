package lambdasfunction.bonus;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class DateAnalyzer {
    public static LocalDate[] getEarliestAndLatestDates(List<LocalDate> dates) {
        Optional<LocalDate> earliestDate = dates.stream()
                .min(Comparator.naturalOrder()); // Finds the earliest date (smallest)

        Optional<LocalDate> latestDate = dates.stream()
                .max(Comparator.naturalOrder()); // Finds the latest date (largest)

        return new LocalDate[] {
                earliestDate.orElse(null),
                latestDate.orElse(null)
        };
    }

    public static void main(String[] args) {
        List<LocalDate> dates = List.of(
                LocalDate.of(2022, 5, 12),
                LocalDate.of(2021, 3, 15),
                LocalDate.of(2023, 7, 21),
                LocalDate.of(2020, 1, 25)
        );

        LocalDate[] result = getEarliestAndLatestDates(dates);

        System.out.println("Earliest Date: " + result[0]);
        System.out.println("Latest Date: " + result[1]);
    }
}
