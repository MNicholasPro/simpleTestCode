package Extthread;

import Controller.LoginServlet;

/**
 * Created by April_Chou on 2017/3/31.
 */
public class ALogin extends Thread {
    @Override
    public void run(){
        LoginServlet.doPost("a","aa");
    }
}
