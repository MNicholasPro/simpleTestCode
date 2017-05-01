package main.java.testNull;

/**
 * Created by April_Chou on 2017/3/9.
 */
public class test1 {
    private String a;
    private String b;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "test1{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}
