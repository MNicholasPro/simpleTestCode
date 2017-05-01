package main.java.ReflectionTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/7.
 */
public class ReflectionTest2 extends Object implements ActionListener,Serializable {
    // 成员变量
    private int bInt;
    public Integer bInteger =new Integer(4);
    public String strB ="crazypebble";
    private String strA;

    // 构造函数
    public ReflectionTest2() {
    }

    protected ReflectionTest2(int id, String name) {
    }

    // 成员方法
    public int abc(int id, String name) {
        System.out.println("crazypebble ---> "+ id +"-"+ name);
        return 0;
    }

    protected static void edf() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
    }
}
