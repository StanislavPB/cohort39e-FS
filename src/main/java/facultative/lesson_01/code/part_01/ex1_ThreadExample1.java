package facultative.lesson_01.code.part_01;

public class ex1_ThreadExample1 extends Thread {
    @Override
    public void run() {
        System.out.println("I'm Thread! My name is " + getName());
    }
}
