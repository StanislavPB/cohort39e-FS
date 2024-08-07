package facultative.lesson_01.code.part_02;

import org.backendcourse.lesson_01.code.part_02.MyRunnable;

public class MyRunnableDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
