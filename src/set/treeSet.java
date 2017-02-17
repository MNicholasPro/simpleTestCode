package set;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/16.
 */
public class treeSet {
    public static void main(String[] args) {
        SortedSet<String> sorter = new TreeSet<>();
        sorter.add("Bob");
        sorter.add("Amy");
        sorter.add("Carl2");
        sorter.add("Carl1");
        for (String s : sorter){
            System.out.println(s);
        }
    }
}
