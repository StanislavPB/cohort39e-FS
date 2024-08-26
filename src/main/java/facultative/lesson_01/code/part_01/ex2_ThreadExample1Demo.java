package facultative.lesson_01.code.part_01;

public class ex2_ThreadExample1Demo {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            ex1_ThreadExample1 thread = new ex1_ThreadExample1();
            thread.start();
        }
    }
}
