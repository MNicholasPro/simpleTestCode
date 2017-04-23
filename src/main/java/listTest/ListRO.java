package main.java.listTest;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/4/6.
 */
public class ListRO {
    private String a;
    private String b;

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "ListRO{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}
