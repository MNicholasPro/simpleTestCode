package main.java.bounceThread;

import main.java.bounce.Ball;
import main.java.bounce.BallComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by April_Chou on 2017/2/19.
 */
public class BounceThread {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new BounceFrame();
                frame.setTitle("BounceThread");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class BallRunnalbe implements Runnable{
    private Ball ball;
    private Component component;
    public static final int STEPS = 1000;
    public static final int DELAY = 5;

    public BallRunnalbe(Ball aBall, Component aComponent){
        ball = aBall;
        component = aComponent;
    }

    public void run(){
        try{
            for(int i = 1;i <= STEPS; i ++){
                ball.move(component.getBounds());
                component.repaint();
                Thread.sleep(DELAY);
            }
        }catch (InterruptedException e ){

        }
    }
}

class BounceFrame extends JFrame{
    private BallComponent comp;

    public BounceFrame(){
        comp = new BallComponent();
        add(comp, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();

        addButton(buttonPanel, "Start", new ActionListener(){
            public void actionPerformed(ActionEvent event){
                addBall();
            }
        });

        addButton(buttonPanel, "Close", new ActionListener(){
            public void actionPerformed(ActionEvent event){
                System.exit(0);
            }
        });
        add(buttonPanel,BorderLayout.SOUTH);
        pack();
    }

    public void addButton(Container c, String title, ActionListener listener){
        JButton button = new JButton(title);
        c.add(button);
        button.addActionListener(listener);
    }

    public void addBall(){
        Ball b = new Ball();
        comp.add(b);
        Runnable r = new BallRunnalbe(b, comp);
        Thread t = new Thread (r);
        t.start();
    }
}
