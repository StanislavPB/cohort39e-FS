package lesson_02.code.threadAndJoinAndDaemon.task_05;

public class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
