package main.java.xianchengTest;

/**
 * Created by April_Chou on 2017/3/24.
 */
public class MyThread2 extends Thread{
    private int i ;
    public MyThread2(int i){
        super();
        this.i = i;
    }

    @Override
    public void run(){
        System.out.println(i);
    }
}
