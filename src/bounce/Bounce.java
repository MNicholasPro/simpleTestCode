package bounce;

import javax.swing.*;
import java.awt.*;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/17.
 */
public class Bounce {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            public void run(){
                JFrame frame = new BounceFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class BounceFrame extends JFrame{
    private BallComponent comp;
    public static final int STFPS = 1000;
    public static final int DELAY = 3;
    public BounceFrame(){
        setTitle("Bounce");

        comp = new BallComponent();
        add(comp, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel()
    }
}
