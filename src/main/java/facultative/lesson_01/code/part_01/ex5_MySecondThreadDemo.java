package facultative.lesson_01.code.part_01;


public class ex5_MySecondThreadDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ex4_MySecondThread thread = new ex4_MySecondThread();
            thread.start();
        }
    }
}
