package lesson_02.code.threadAndJoinAndDaemon.task_02;

public class CarDemo {
    public static void main(String[] args) {
        var ferrari = new Car("Ferrari");
        var bmw = new Car("BMW");

        ferrari.start();
        bmw.start();

        System.out.println("Methods continue execution ... Main method is execution by Thread " + Thread.currentThread().getName());
    }
}
