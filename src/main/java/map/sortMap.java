package main.java.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/3/28.
 */
public class sortMap {
    public static void main(String[] args){
        Map<String , Integer> map =  new LinkedHashMap<String , Integer>();
        map.put("5",5);
        map.put("2",2);
        map.put("6",6);
        map.put("4",4);
        map.put("5",5);
        map.put("3",3);
        map.put("1",1);
        System.out.println(map);

        System.out.println(sortgetMap.getSortMap(map));
    }
}
