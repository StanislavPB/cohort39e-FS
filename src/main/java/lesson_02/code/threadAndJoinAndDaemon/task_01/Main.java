package lesson_02.code.threadAndJoinAndDaemon.task_01;

public class Main {

    public static void main(String[] args) {

        // Способы создания потоков:
        // 1. Наследуемся от класса Thread

        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        // Старт отдельного потока при первом способе
        myThread1.start();
        myThread2.start();


    }
}