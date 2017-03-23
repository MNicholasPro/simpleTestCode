package xianchengTest;

/**
 * Created by April_Chou on 2017/3/24.
 */
public class MyThread1 extends Thread {
    private String name ;

    public MyThread1(String name){
        super();
        this.name = name;
    }
    @Override
    public void run(){
        try{
            for (int i =0; i < 11; i ++){
                int time = (int)(Math.random() * 1000);
                Thread.sleep(time);
                System.out.println(name + i);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
