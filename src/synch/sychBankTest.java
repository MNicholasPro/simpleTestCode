package synch;


/**
 * Created by April_Chou on 2017/2/19.
 */
public class sychBankTest {
    public static final int NACCOUNTS = 100;
    public static final double INITIAL_BALANCE = 100;

    public static void main(String[] args){
        Bank b = new Bank(NACCOUNTS,INITIAL_BALANCE);
        int i;
        for (i = 0; i <NACCOUNTS; i++){
            TransferRunnable r = new TransferRunnable(b,i,INITIAL_BALANCE);
            Thread t = new Thread(r);
            t.start();
        }
    }
}
