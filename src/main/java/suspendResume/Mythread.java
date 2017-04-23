package main.java.suspendResume;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/4/23.
 */
public class Mythread extends Thread{
    private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run(){
        while (true){
            i++;
        }
    }
}
