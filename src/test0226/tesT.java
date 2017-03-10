package test0226;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/26.
 */
public class tesT {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());

        //输出3~6
        double  a = Math.random() *(6-3) + 6;
        System.out.println(a);
    }
}
