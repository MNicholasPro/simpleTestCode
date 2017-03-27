package fanzhuan;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/3/17.
 */
public class ddd {
    public static void main(String[] args) {
//      Map<String, Object> map = new HashMap<String, Object>();
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("username", "zhaokuo");
        map.put("password", "123456");
        map.put("email", "zhaokuo719@163.com");
        map.put("sex", "男");

        //第一种 用for循环的方式
        for (Map.Entry<String, Object> m : map.entrySet()) {
            System.out.println(m.getKey() + "\t" + m.getValue());
        }
    }
}
