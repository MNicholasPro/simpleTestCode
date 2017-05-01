package main.java.priority;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/4/23.
 */
public class MyThread1 extends Thread {
    @Override
    public void run(){
        System.out.println("MyThread1 run prioirty=" + this.getPriority());
        MyThread2 thread2 = new MyThread2();
        thread2.start();
    }
}
