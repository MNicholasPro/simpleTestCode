package main.java.ReflectionTest;

import java.util.ArrayList;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/7.
 */
public class ObjectAnalyzerTest {
    public static void main(String[] args){
        ArrayList<Integer> squares = new ArrayList<>();
        for(int i = 1; i <= 5; i++){
            squares.add(i *i );
            System.out.println(new ObjectAnalyzer().toString(squares));
        }
    }
}
