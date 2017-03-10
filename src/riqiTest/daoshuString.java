package riqiTest;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/3/9.
 */
public class daoshuString {
    public static void main(String[] args) {


        String s = "abcdefg";
        String s2 = "";
        char[] cs = s.toCharArray();
        for (int i = cs.length - 1; i >= 0; i--) {
            s2 = s2 + cs[i];
        }
        System.out.println("对字符串进行反转操作后为:" + s2);
        StringBuffer sb = new StringBuffer("abcdefg");
        StringBuffer sb2 = sb.reverse();
        System.out.println("对StringBuffer进行反转操作后为:" + sb2);
    }
}

