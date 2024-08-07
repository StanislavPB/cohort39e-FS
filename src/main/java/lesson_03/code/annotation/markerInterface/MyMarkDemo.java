package lesson_03.code.annotation.markerInterface;

public class MyMarkDemo {
    public static void main(String[] args) {
        MarkedClass marked = new MarkedClass();
        NonMarkedClass nonMarked = new NonMarkedClass();

        test(marked);
       // test(nonMarked);

    }

    static void test(MyMark obj){
        System.out.println("метод 'test' пройден успешно");
    }
}
