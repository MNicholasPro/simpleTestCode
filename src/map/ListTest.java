package map;

import java.util.ArrayList;
import java.util.Date;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/16.
 */
public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList rawList = strings;
        rawList.add(new Date());
        System.out.println(rawList);
        System.out.println(rawList.get(0));
    }
}
