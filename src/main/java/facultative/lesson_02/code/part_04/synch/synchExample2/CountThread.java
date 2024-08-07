package facultative.lesson_02.code.part_04.synch.synchExample2;

public class CountThread implements Runnable{
    CommonResource res;

    public CountThread(CommonResource res) {
        this.res = res;
    }

    @Override
    public void run() {
    res.increment();
    }
}
