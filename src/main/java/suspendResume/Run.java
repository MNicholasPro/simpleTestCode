package main.java.suspendResume;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/4/23.
 */
public class Run {
    public static void main(String[] args) {
        try{
            Mythread thread = new Mythread();
            thread.start();
            Thread.sleep(5000);

            thread.suspend();
            System.out.println("A=" + System.currentTimeMillis() + " i=" + thread.getI());
            thread.sleep(5000);
            System.out.println("A=" + System.currentTimeMillis() + " i=" + thread.getI());

            thread.resume();
            Thread.sleep(5000);

            thread.suspend();
            System.out.println("B=" + System.currentTimeMillis() + " i=" + thread.getI());
            thread.sleep(5000);
            System.out.println("B=" + System.currentTimeMillis() + " i=" + thread.getI());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
