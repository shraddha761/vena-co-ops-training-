package lambdasfunction.customtype;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CsvToList {
    public static List<Integer> csvToList(String csv) {
        if(csv == null || csv.isEmpty()) {
            return Collections.emptyList();
        }
        return Arrays.stream(csv.split(","))
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .map(Integer::parseInt)
                .toList();
    }
    public static void main(String[] args) {
        String csv = "1,2,3,4,5, ,6";

        System.out.println("Numbers: " + csvToList(csv));
    }
}