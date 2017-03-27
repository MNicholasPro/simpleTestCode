package fanzhuan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/3/10.
 */
public class gest {
    public static void main(String[] args) {
/*        Scanner str = new Scanner(System.in);
//        String str2 = str.next();
        char[] str3 = str.next().toCharArray();
        List str4 = new ArrayList();
        StringBuffer str5 = new StringBuffer();
        for(int i = 0; i < str3.length; i ++){
            str4.add(str3[i]);
        }
        for (int j = str4.size() - 1; j >= 0; j --){
            str5.append(str4.get(j));
        }
        System.out.print(str5);*/

/*        double percent = (1 + 0.0) / (3 + 0.0);
        double percent2 = (1 ) / (3 );
        System.out.println(percent);
        System.out.println(percent2);*/

/*        String a = ",zmk,zmh,zj";
        String[] s = a.split(",");
        System.out.println(s.length);
        System.out.println(s[1]+s[2]+s[3]);*/

            List<String> test = new ArrayList<String>();
            HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("cn", "中国");
            hashMap.put("fr", "法国");
            hashMap.put("jp", "日本");
            hashMap.put("test", "a" + test.add("233"));
        System.out.println(hashMap);

    }
}
