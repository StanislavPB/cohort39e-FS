package lesson_02.code.threadAndJoinAndDaemon.task_05;

public class CounterDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread1 = new Thread(new MyRunnable(counter));
        Thread thread2 = new Thread(new MyRunnable(counter));

        //thread1.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Count: " + counter.getCount());

    }
}
