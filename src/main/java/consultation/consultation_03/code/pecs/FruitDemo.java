package consultation.consultation_03.code.pecs;

import java.util.ArrayList;
import java.util.List;

public class FruitDemo {
    public static void main(String[] args) {

        // коллекции фруктов

        List<Fruit> fruits = new ArrayList<>();
        List<Apple> apples = new ArrayList<>();
        List<Orange> oranges = new ArrayList<>();

        // добавим в коллекции несколько элементов

        fruits.add(new Orange());
        fruits.add(new Apple());

        apples.add(new Apple());
        apples.add(new Apple());

        oranges.add(new Orange());
        oranges.add(new Orange());
        oranges.add(new Orange());


        // напечатаем наши коллекции

        System.out.println("Producer extends :");
        printFruits(fruits);

        System.out.println("Producer extends :");
        printFruits(apples);
        System.out.println("Producer extends :");
        printFruits(oranges);

        System.out.println("------------------");

        addAppleToCollection(fruits);

        printFruits(fruits);

    }


    public static void printFruits(List<? extends Fruit> fruits){

        for (Fruit fruit : fruits){
            System.out.println(fruit);
        }
    }

    public static void addAppleToCollection(List<? super Apple> list){
        list.add(new Apple());
        System.out.println("Добавили яблоко в коллекцию");
    }
}
