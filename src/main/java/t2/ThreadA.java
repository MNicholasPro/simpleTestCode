package main.java.t2;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/4/23.
 */
public class ThreadA extends Thread {
    private HasSelfPrivateNum numRef;
    public ThreadA(HasSelfPrivateNum numRef){
        super();
        this.numRef = numRef;
    }

    @Override
    public void run(){
        super.run();
        numRef.addI("a");
    }
}
