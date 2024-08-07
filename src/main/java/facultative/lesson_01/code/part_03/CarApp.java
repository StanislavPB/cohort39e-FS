package facultative.lesson_01.code.part_03;

import org.backendcourse.lesson_01.code.part_03.Car;

public class CarApp {
    public static void main(String[] args) {
        var ferrari = new org.backendcourse.lesson_01.code.part_03.Car("Ferrari");
        var bmw = new Car("BMW");
        ferrari.start();
        bmw.start();

        System.out.println("Method continue execution... Main method is executed by thread " + Thread.currentThread().getName());
    }
}
