package main.java.blockingQueue;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/22.
 */
public class TwoThreads {
    public static class Thread1 extends Thread {
        @Override
        public void run() {
            System.out.println("A");
            System.out.println("B");
        }
    }
    public static class Thread2 extends Thread {
        @Override
        public void run() {
            System.out.println("1");
            System.out.println("2");
        }
    }
    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }
}
