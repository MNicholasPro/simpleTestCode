package main.java.synch;


/**
 * Created by April_Chou on 2017/2/19.
 */
public class TransferRunnable implements Runnable{
    private main.java.synch.Bank bank;
    private int fromAccount;
    private double maxAmount;
    private int DELAY = 10;

    public TransferRunnable(Bank b, int from, double max){
        bank = b;
        fromAccount = from;
        maxAmount = max;
    }

    public void run(){
        try{
            while (true){
                int toAccount = (int)(bank.size() * Math.random());
                double amount = maxAmount * Math.random();
                bank.transfer(fromAccount, toAccount, amount);
                Thread.sleep((int)(DELAY * Math.random()));
            }
        }catch (InterruptedException e){

        }
    }
}
