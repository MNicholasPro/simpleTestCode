package main.java.daemon;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/4/23.
 */
public class MyThread extends Thread {
    private int i = 0;
    @Override
    public  void run(){
        try{
            while (true){
                i ++;
                System.out.println("i= " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
