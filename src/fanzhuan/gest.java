package fanzhuan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/3/10.
 */
public class gest {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
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
        System.out.print(str5);
    }
}
