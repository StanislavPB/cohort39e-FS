package lesson_02.code.threadAndJoinAndDaemon.task_06;

public class DaemonDemo {
    public static void main(String[] args) {
        var worker = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            var threadName = Thread.currentThread().getName();

            System.out.println("Thread is finishing its execution with name: " + threadName) ;
        }, "Worker");

        var daemon = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            var threadName = Thread.currentThread().getName();

            System.out.println("Thread is finishing its execution with name: " + threadName);
        }
        }, "Daemon");

        daemon.setDaemon(true);

        worker.start();
        daemon.start();

        var threadName = Thread.currentThread().getName();
        System.out.println("Thread is executing with name: " + threadName);

    }
}
