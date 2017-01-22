package equals;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/1/22.
 */
public class testequals {
    public static void main(String[] args){
        String aaa = new String("OK");
        String bbb = new String("OK");
        String a = "OK";
        String b = "OK";
        Integer aa = 1;
        Integer bb = 1;
        System.out.println("aaa == bbb :" + aaa == bbb);
        System.out.println("aaa.equals(bbb) :" + aaa.equals(bbb));

        if(aa==bb){
            System.out.println("aa == bb " );
        }

        if(a==b){
            System.out.println("a == b " );
        }

        System.out.println("a == b :" + (a == b));
        System.out.println("aa.equals(bb) :" + aa.equals(bb));
    }
}
