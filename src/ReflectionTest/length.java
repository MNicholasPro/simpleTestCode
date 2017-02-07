package ReflectionTest;

import java.lang.reflect.Array;

/**
 * Created by April_Chou on 2017/2/7.
 */
public class length {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8,9};
        int b = Array.getLength(a);
        System.out.println(b);
    }
}
