package xianchengTest;

/**
 * Created by April_Chou on 2017/3/24.
 */
public class Run2 {
    public static void main(String[] args){
        MyThread2 t1 = new MyThread2(1);
        MyThread2 t2 = new MyThread2(2);
        MyThread2 t3 = new MyThread2(3);
        MyThread2 t4 = new MyThread2(4);
        MyThread2 t5 = new MyThread2(5);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
