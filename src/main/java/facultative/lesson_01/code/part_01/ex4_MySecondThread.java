package facultative.lesson_01.code.part_01;

public class ex4_MySecondThread extends Thread {
    @Override
    public void run() {
        long sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += i;
        }
        System.out.println(getName() + " sum: " + sum);
    }
}
