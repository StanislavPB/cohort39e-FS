package lesson_02.code.synchronize;

public class MonitorDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        Runnable task = () -> {
            synchronized (lock) {
                System.out.println("Thread started");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("thread finished");
            }
        };

        Thread thread1 = new Thread(task);
        thread1.start();

        // продолжает работу метод main

        for (int i = 0; i < 1000000; i++) {

        }

        synchronized (lock) {
            for (int i = 0; i < 8; i++) {
                Thread.currentThread().sleep(1000);
                System.out.println(" " + i);
            }
            System.out.println(".... ");
        }
    }
}
