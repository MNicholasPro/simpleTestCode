package main.java.priority;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/4/23.
 */
public class MyThread2 extends Thread {
    @Override
    public void run(){
        System.out.println("MyThread2 run priority=" + this.getPriority());
    }
}
