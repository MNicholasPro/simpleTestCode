package Extthread;

import Controller.LoginServlet;

/**
 * Created by April_Chou on 2017/3/31.
 */
public class BLogin extends Thread {
    @Override
    public void run(){
        LoginServlet.doPost("b","bb");
    }
}
