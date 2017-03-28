package myrunnable;

/**
 * Created by April_Chou on 2017/3/29.
 */
public class Run {
    public static void main(String[] args){
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束、、、、、");
    }
}
