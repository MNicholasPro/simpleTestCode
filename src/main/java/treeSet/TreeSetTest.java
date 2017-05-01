package main.java.treeSet;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/16.
 */
public class TreeSetTest {
    public static void main(String[] args) {
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("Toaster", 1234));
        parts.add(new Item("Widget", 4562));
        parts.add(new Item("Modem", 9912));
        System.out.println(parts);

        SortedSet<Item> sortByDrscription = new TreeSet<>(new Comparator<Item>() {
            public int compare(Item a , Item b){
                String descrA = a.getDescription();
                String descrB = b.getDescription();
                return descrA.compareTo(descrB);
            }
        });
        sortByDrscription.addAll(parts);
        System.out.println(sortByDrscription);
    }
}
