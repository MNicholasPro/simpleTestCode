package main.java.returnStop;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/4/23.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException{
        MyThread t = new MyThread();
        t.start();
        Thread.sleep(2000);
        t.interrupt();
    }
}
