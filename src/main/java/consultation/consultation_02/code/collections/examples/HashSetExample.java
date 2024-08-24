package code.collections.examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        Set<Integer> integers = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        int sumOfEvenNumbers = integers.stream()
                .filter(number -> number % 2 ==0)
                .mapToInt(number -> number.intValue())
                .sum();

        System.out.println("Result = " + sumOfEvenNumbers);
    }
}
