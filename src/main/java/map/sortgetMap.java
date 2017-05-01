package main.java.map;

import java.util.*;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/3/28.
 */
public class sortgetMap {
    public static Map<String,Integer> getSortMap(Map<String,Integer> map){
        List<Map.Entry<String, Integer>> infos = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());

        //对list排序,实现新的比较器

        Collections.sort(infos, new Comparator<Map.Entry<String, Integer>>(){

            @Override

            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {

                return o2.getValue() - o1.getValue();

            }

        });

        //申明新的有序 map,根据放入的数序排序

        Map<String, Integer> lhm = new LinkedHashMap<String, Integer>();

        //遍历比较过后的map,将结果放到LinkedHashMap

        for(Map.Entry<String, Integer> entry:infos){

            lhm.put(entry.getKey(), entry.getValue());

        }
        return lhm;
    }
}
