package main.java.xianchengTest;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/23.
 */
public class MutliThreadDemo2 {
    public static void main(String[] args) {
        MutliThread2 m1 = new MutliThread2("Window 1");
        MutliThread2 m2 = new MutliThread2("Window 2");
        MutliThread2 m3 = new MutliThread2("Window 3");
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        Thread t3 = new Thread(m3);
        t1.start();
        t2.start();
        t3.start();
    }
}

class MutliThread2 implements Runnable{
    private int ticket = 100;
    private String name ;

    public MutliThread2(String name) {
        this.name = name;
    }

    public void run(){
        while (ticket > 0){
            System.out.println(ticket-- + "is saled by" + name);
        }
    }
}
