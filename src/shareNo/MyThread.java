package shareNo;

/**
 * Created by April_Chou on 2017/3/29.
 */
public class MyThread extends Thread {
    private int count = 5;
    @Override
    public void run(){
        super.run();
        count --;
        System.out.println("由" + this.currentThread().getName() + "计算，count= " + count);
    }
}
