package lambdasfunction.customtype.q39;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgeGroupMap {
    static Map<String, List<Person>> groupByAgeGroup(List<Person> people){
        return people.stream()
                .collect(Collectors.groupingBy(person -> {
                int age = person.getAge();
                if(age < 20) return "<20";
                else if(age <= 40) return "20-40";
                else return "40+";
        }));
    }
 public static void main(String[] args) {
     List<Person> people = Arrays.asList(
             new Person("Shraddha", 21),
             new Person("Krishan", 23),
             new Person("Radha", 60)
     );

     Map<String, List<Person>> grouped = groupByAgeGroup(people);
     grouped.forEach((k, v) -> {
         System.out.println(k + ": " + v);
     });
  }
}
