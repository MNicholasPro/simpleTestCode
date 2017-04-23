package main.java.pair2;

import main.java.pair1.Pair;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by April_Chou on 2017/2/11.
 */
public class PairTest2 {
    public static void main(String[] args) {
        GregorianCalendar[] birthdays ={
                new GregorianCalendar(1906, Calendar.DECEMBER, 9),
                new GregorianCalendar(1815, Calendar.DECEMBER, 10),
                new GregorianCalendar(1903, Calendar.DECEMBER, 3),
                new GregorianCalendar(1910, Calendar.JUNE, 22),
        };
        Pair<GregorianCalendar> mm = ArrayAlg.minmax(birthdays);
        System.out.println("min = " + mm.getFirst().getTime());
        System.out.println("max = " + mm.getSecond().getTime());
    }
}

class ArrayAlg{
    public static <T extends Comparable> Pair<T> minmax(T[] a){
        if ( a == null || a.length == 0) {
            return null;
        }
            T min = a[0];
            T max = a[0];
        for(int j = 1; j < a.length; j++){
            if (min.compareTo(a[j]) > 0){
                min = a[j];
            }
            if (max.compareTo(a[j]) < 0){
                max = a[j];
            }
        }
        return new Pair<>(min,max);
    }
}
