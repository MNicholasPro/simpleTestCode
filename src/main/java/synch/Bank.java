package main.java.synch;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by April_Chou on 2017/2/19.
 */
public class Bank {
    private final double[] accounts ;
    private Lock bankLock;
    private Condition sufficientFounds;

    public Bank(int n, double initialBalance){
        accounts = new double[n];
        for(int i = 0; i < accounts.length; i ++){
            bankLock = new ReentrantLock();
            sufficientFounds = bankLock.newCondition();
        }
    }

    public void transfer(int from,int to,double amount) throws InterruptedException{
        bankLock.lock();
        try{
            while (accounts[from] < amount){
                sufficientFounds.await();
            }
            System.out.print(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf("%10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf("Total Balance:%10.2f%n", getTotalBalance());
            sufficientFounds.signalAll();
        }finally {
            bankLock.unlock();
        }
    }

    public double getTotalBalance(){
        bankLock.lock();
        try{
            double sum = 0;
            for (double a : accounts){
                sum += a;
            }
            return sum;
        }finally {
            bankLock.unlock();
        }
    }

    public int size(){
        return accounts.length;
    }
}
