package main.java.listTest;

import java.util.ArrayList;
import java.util.List;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/4/6.
 */
public class ListROTest {
    public static void main(String[] args) {
        ListRO aa = new ListRO();
        List<ListRO> aaa = new ArrayList<ListRO>();
        aa.setA("a");
        aaa.add(aa);
        aa.setA("aa");
        aaa.add(aa);
        aa.setA("aaa");
        aaa.add(aa);
/*        for (int i = 0; i < aa.size(); i++){
            aa.get(i).setA("aChong");
        }*/

        for (ListRO bb : aaa){
            bb.setA("shezhi");
        }

        System.out.println(aaa);
    }
}
