package main.java.HashCode;

import java.util.Objects;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/1/20.
 */
public class testHashCode {
    public static void main(String[] args){
        String s = "OK";
        StringBuilder sb = new StringBuilder("OK");
        System.out.println(s.hashCode() + " " + sb.hashCode());

        String t = new String("OK");
        StringBuilder tb = new StringBuilder("OK");
        System.out.println(t.hashCode() + " " + tb.hashCode());

        String name = "zhoumingkai";
        int a = Objects.hash(name);
        StringBuilder b = new StringBuilder("zhoumingkai");
        int c = Objects.hash(b);
        System.out.println("a=" + a + "," + "c=" + c + "," + "b=" + b);

        String aa = "abcde";
        String bb = "abcde";
        StringBuilder cc = new StringBuilder("abcde");
        System.out.println("aa=" + aa + "," + "cc=" + cc + "," + "bb=" + bb);
        System.out.println(aa.equals(bb) + "," + (aa.hashCode() == bb.hashCode()));
        System.out.println(aa.equals(bb) + "," + (aa.hashCode() == cc.hashCode()));

    }
}
