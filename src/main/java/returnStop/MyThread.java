package main.java.returnStop;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/4/23.
 */
public class MyThread extends Thread{
    @Override
    public void run(){
        while (true){
            if (this.isInterrupted()){
                System.out.println("停止了！");
                return;
            }
            System.out.println("timer=" + System.currentTimeMillis());
        }
    }
}
