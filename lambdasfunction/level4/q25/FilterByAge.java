package lambdasfunction.level4.q25;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterByAge {

    public static List<String> adultnames(List<Person> people){
        return people.stream()
                .filter(Objects::nonNull)
                .filter(p -> p.getAge() > 18)
                .map(Person::getName)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Shraddha", 22),
                new Person("Krishan", 23),
                new Person("Radha", 20)
        );

        System.out.println("Adult names: " + adultnames(people));
    }
}
