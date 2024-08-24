package consultation_02.code.collections.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alex","Robert","Ruslan","Andrew","Alex","Robert");

        List<String> uniqueSortedNames = names.stream()
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .map(name -> name.toUpperCase())
                .toList();

        System.out.println(uniqueSortedNames);


        Set<String> uniqueSortedNamesSet = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toSet());

        System.out.println(uniqueSortedNamesSet);

        List<String> uniqueSortedNames2 = uniqueSortedNamesSet.stream()
                .sorted()
                .toList();

        System.out.println(uniqueSortedNames2);





    }
}
