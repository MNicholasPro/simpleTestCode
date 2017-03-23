package xianchengTest;

/**
 * Created by April_Chou on 2017/3/24.
 */
public class Run1 {
    public static void main(String[] args){
        try{
            MyThread1 myThread1 = new MyThread1("ttt");
//            myThread1.setName("mythread");
            myThread1.start();
            for (int i = 0; i < 10; i ++){
                int time = (int)(Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
