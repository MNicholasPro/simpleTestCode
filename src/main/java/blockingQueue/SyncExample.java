package main.java.blockingQueue;

import java.util.Date;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/23.
 */
public class SyncExample {
    public static class Thingie {
        private Date lastAccess;
        public synchronized void setLastAccess(Date date) {
            this.lastAccess = date;
        }
    }

    public static class MyThread extends Thread {
        private Thingie thingie;
        public MyThread(Thingie thingie) {
            this.thingie = thingie;
        }
        public void run() {
            thingie.setLastAccess(new Date());
            System.out.println("aaa");
        }
    }

    public static void main(String[] args) {
        Thingie thingie1 = new Thingie(),
                thingie2 = new Thingie();
        new MyThread(thingie1).start();
        new MyThread(thingie2).start();
    }
}
