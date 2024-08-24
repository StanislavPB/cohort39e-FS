package consultation_02.code.collections.examples;

import java.util.Arrays;
import java.util.List;

public class MethodRef {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alex","Robert","Ruslan","Andrew","Alex","Robert");

        names.forEach(name -> System.out.print(name + ", "));

        System.out.println();

        names.forEach(System.out::print);
    }
}
