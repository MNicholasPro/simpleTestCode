package fanzhuan;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/3/9.
 */
public class shouxie {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        int length = str.length();
        char[] chars =  str.toCharArray();
        for(int i = 0 ; i < length / 2 ; i ++){
            char temp;
            temp = chars[i];
            chars[i] = chars[length - 1 -i];
            chars[length -1 - i] = temp;
        }
        System.out.println(chars);
    }
}
