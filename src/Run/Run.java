package Run;

import Extthread.ALogin;
import Extthread.BLogin;

/**
 * Created by April_Chou on 2017/3/31.
 */
public class Run {
    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();
    }
}
