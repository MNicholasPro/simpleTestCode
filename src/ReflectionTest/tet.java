package ReflectionTest;

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
        System.out.println("c1:::"+cl);
        String c2 = cl.getName();
        System.out.println("c2:::"+c2);

        try {
            String className = "java.util.Date";
            Class cc = className.getClass();
            System.out.println("cc:::"+cc);
            Class c3 = Class.forName(className);
            Object cc3 = Class.forName(className).newInstance();
            System.out.println("c3:::"+c3);

            String s = "java.util.Date";
            Object m = Class.forName(s).newInstance();
            System.out.println("m:::"+m);

            String aa = "abc";
            Class c4 = aa.getClass();
            System.out.println("c4:::"+c4);

            Button b = new Button();
            Class q = b.getClass();
            Class w = q.asSubclass(q);
            System.out.println("w:::"+w);

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
