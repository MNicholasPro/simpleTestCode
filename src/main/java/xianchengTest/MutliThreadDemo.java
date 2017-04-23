package main.java.xianchengTest;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/23.
 */
public class MutliThreadDemo {
    public static void main(String[] args) {
        MutliThread m1 = new MutliThread("Window 1");
        MutliThread m2 = new MutliThread("Window 2");
        MutliThread m3 = new MutliThread("Window 3");
        m1.start();
        m2.start();
        m3.start();
    }
}

class MutliThread extends Thread{
    private int ticket = 100;
    MutliThread(String name){
        super(name);
    }

    public void run(){
        while (ticket > 0){
            System.out.println(ticket-- + "is saled by" + Thread.currentThread().getName());
        }
    }
}
