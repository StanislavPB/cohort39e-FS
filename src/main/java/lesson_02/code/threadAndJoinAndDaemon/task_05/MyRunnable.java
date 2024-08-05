package lesson_02.code.threadAndJoinAndDaemon.task_05;

public class MyRunnable implements Runnable{

    private final Counter counter;

    public MyRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
