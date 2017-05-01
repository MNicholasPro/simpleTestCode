package main.java.testNull;

/**
 * Created by April_Chou on 2017/3/9.
 */
public class test2 {
    public static void main(String[] args) {
        test1 aa = new test1();
        test1 bb = null;
        aa.setA(null);
        System.out.println(aa);
        System.out.println(bb);
    }
}
