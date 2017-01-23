package equals;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/1/23.
 */
public class IntValue {
  public static void main(String[] args){
        String str="82";
        String str2 = "OK";
        int a1 = Integer.parseInt(str2);
        int a2 = Integer.valueOf(str2);
        System.out.println(a1);
        System.out.println(a2);
    }
}
