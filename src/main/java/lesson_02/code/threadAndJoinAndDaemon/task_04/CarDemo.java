package lesson_02.code.threadAndJoinAndDaemon.task_04;

public class CarDemo {
    public static void main(String[] args) {
        var ferrari = new Car("Ferrari");
        var bmw = new Car("BMW");

        var ferrariThread = new Thread(ferrari);
        var bmwThread = new Thread(bmw);


        ferrariThread.start();
        bmwThread.start();

        System.out.println("Methods continue execution ... Main method is execution by Thread " + Thread.currentThread().getName());
    }
}
