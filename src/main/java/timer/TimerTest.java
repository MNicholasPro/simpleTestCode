package main.java.timer;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/8.
 */
public class TimerTest {
    public static void main(String[] args){
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(10000,listener);
        t.start();

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }

   static class TimePrinter implements ActionListener{
        public void actionPerformed(ActionEvent event){
            Date now = new Date();
            System.out.println("At the tone,the time is"+now);
            Toolkit.getDefaultToolkit().beep();
        }
    }
}
