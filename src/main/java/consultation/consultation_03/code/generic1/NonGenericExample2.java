package consultation.consultation_03.code.generic1;

import java.util.ArrayList;
import java.util.List;

public class NonGenericExample2 {
    public static void main(String[] args) {

        List list = new ArrayList<>();

        list.add("Text1");
        list.add("Text2");
        list.add("Text3");
        list.add("Text4");
        list.add("Text5");
        list.add(123435);

        print(list);


    }

    public static void print(List list){
        for (int i = 0; i < list.size(); i++) {

                String currentElement = (String) list.get(i);

                System.out.println("Текущий элемент: " + currentElement);
                System.out.println("Длина слова = " + currentElement.length());


        }
    }
}
