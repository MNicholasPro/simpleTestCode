package toString;

import com.sun.javaws.Main;

import java.awt.*;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/7.
 */
public class tet {
    public static void main(String[] args){
        String name = "jjj";
        Class cl = name.getClass();
        String c2 = cl.getName();
        System.out.println(c2);

        try {
            String className = "java.util.Date";
            Class c3 = Class.forName(className);
            System.out.println(c3);

            String s = "java.util.Date";
            Object m = Class.forName(s).newInstance();
            System.out.println(m);

            String aa = "abc";
            Class c4 = aa.getClass();
            System.out.println(c4);

            Button b = new Button();
            Class q = b.getClass();
            Class w = q.asSubclass(q);
            System.out.println(w);

            Class q1 = String.class;
            Class q2 = java.awt.Button.class;
            Class q4 = int.class;
            Class q5 = int[].class;
            System.out.println("q1:" + q1 + "," + "q2:" + q2 + "," + "q4:" + q4 + "," + "q5:" + q5);
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
