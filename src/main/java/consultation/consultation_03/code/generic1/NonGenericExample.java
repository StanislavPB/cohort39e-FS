package consultation.consultation_03.code.generic1;

import java.util.ArrayList;
import java.util.List;

public class NonGenericExample {
    public static void main(String[] args) {

        List list = new ArrayList<>();

        list.add("Java");
        list.add(12345);
        list.add(true);

        print(list);


    }

    public static void print(List list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
