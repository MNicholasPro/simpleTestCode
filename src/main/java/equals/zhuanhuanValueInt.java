package main.java.equals;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/1/23.
 */
public class zhuanhuanValueInt {
    public static void main(String[] args){
        Integer a = Integer.parseInt("123");
        int b = 123;
        Integer c = Integer.valueOf(123);
        Integer d = Integer.valueOf(123).intValue();
        System.out.println( a == b );
        System.out.println( a == c );
        System.out.println( b == c );
        System.out.println(a == d );
        System.out.println(b == d );
        System.out.println(c == d );
    }
}
