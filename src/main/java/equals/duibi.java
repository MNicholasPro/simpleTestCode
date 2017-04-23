package main.java.equals;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/1/23.
 */
public class duibi {
    public static void main(String[] args){
        Integer a = 1000;
        Integer b = 1000;
        Integer c = a;
        int d = 1000;
        System.out.println(a.equals(b));
        System.out.println(a == c);
        System.out.println(a == b);
        System.out.println(a == d);

    }
}
