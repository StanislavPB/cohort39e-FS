package lesson_02.code.threadAndJoinAndDaemon.task_02;

public class Car extends Thread{
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Car " + model + " is being driven by Thread " + Thread.currentThread().getName());
    }
}
