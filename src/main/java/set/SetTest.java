package main.java.set;

import java.util.HashSet;
import java.util.Set;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/16.
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();//改造空的散列表
        words.add("Bob");
        words.add("Uny");
        words.add("Nuy");
        words.add("Aoo");
        System.out.println(words);
        for (String wordss : words){
            System.out.println(wordss);
        }

/*
        long totalTime = 0;

        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String word = in.next();
            long callTime = System.currentTimeMillis();
            words.add(word);
            callTime = System.currentTimeMillis() - callTime;
            totalTime += callTime;
        }

        Iterator<String> iter = words.iterator();
        for(int i = 1; i <= 20 && iter.hasNext(); i++){
            System.out.println(iter.next());
        }
        System.out.println("...");
        System.out.println(words.size() + "distinct words." + totalTime + "milliseconds.");
*/
    }
}
