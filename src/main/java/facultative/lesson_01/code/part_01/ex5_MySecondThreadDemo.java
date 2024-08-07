package facultative.lesson_01.code.part_01;

import org.backendcourse.lesson_01.code.part_01.ex4_MySecondThread;

public class ex5_MySecondThreadDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            org.backendcourse.lesson_01.code.part_01.ex4_MySecondThread thread = new ex4_MySecondThread();
            thread.start();
        }
    }
}
