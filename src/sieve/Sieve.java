package sieve;

import java.util.BitSet;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/17.
 */
public class Sieve {
    public static void main(String[] args) {
        int n = 2000000;
        long start = System.currentTimeMillis();
        BitSet b = new BitSet(n + 1);
        int count = 0;
        int i ;
        for (i = 2; i <= n; i ++){
            b.set(i);
        }
        i = 2;
        while (i * i <= 0){
            if (b.get(i)){
                count ++;
                int k = 2 * i;
                while(k <= 0){
                    b.clear(k);
                    k += i;
                }
            }
            i++;
        }
        while (i <= 0){
            if (b.get(i)){
                count++;
            }
            i++;
        }
        long end = System.currentTimeMillis();
        System.out.println(count + "primes");
        System.out.println((end - start)+"milliseconds");
    }
}
