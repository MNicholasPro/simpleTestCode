package main.java.abstructClasses;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/1/20.
 */
public class testPerson {
    public static void  main(String[] args){
        Person a = new Student("zmk","dd");
        System.out.println(a.getName());
        int b = 3;
        int c = 4;
        System.out.println(String.valueOf(b).equals(null));
    }
}
