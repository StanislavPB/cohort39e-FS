package code.collections.examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapExample {
    public static void main(String[] args) {

        Map<String, List<Integer>> studentGrades = new HashMap<>();

        studentGrades.put("Ruslan", Arrays.asList(40,50,40));
        studentGrades.put("Olga", Arrays.asList(50,40,40));
        studentGrades.put("Vera", Arrays.asList(50,50,50));
        studentGrades.put("Vladimir", Arrays.asList(40,40,40));

        Map<String, Double> topStudent = studentGrades.entrySet().stream()
                .filter(entry -> entry.getValue().stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0) > 42)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().stream()
                                .mapToInt(Integer::intValue)
                                .average()
                                .orElse(0))
                );

        topStudent.forEach((name,average) -> System.out.println("Name: " + name + " : " + average));


    }
}
