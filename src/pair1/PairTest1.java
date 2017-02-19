/*
package pair1;


*/
/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/10.
 *//*

public class PairTest1 {
    public static void main(String[] args) {
        String[] words = {"Marry", "had", "a", "little", "lamb"};
        int[] aint = {1, 6, 9, 8, 22};
        Pair<String> mm = ArrayAlg.mminmax(words);
        Pair mm2 = ArrayAlg2.mminmax2(aint);
        System.out.println("min=" + mm.getFirst());
        System.out.println("max=" + mm.getSecond());
        System.out.println("min=" + mm2.getFirst());
        System.out.println("max=" + mm2.getSecond());
    }
}

class ArrayAlg2{
    public static Pair<String> mminmax2(int[] b){
        if(b == null || b.length == 0){
            return null;
        }
        int min2 = b[0];
        int max2 = b[0];

        for(int i = 1; i < b.length; i++){
            if(min2 > b[i]){
                min2 = b[i];
            }
            if(max2 < b[i]){
                max2 = b[i];
            }
        }
        return new Pair(min2,max2);
    }
}

class ArrayAlg{
    public static Pair<String> mminmax(String[] a){
        if(a == null || a.length == 0){
            return null;
        }
        String min = a[0];
        String max = a[0];

        for(int i = 1; i < a.length; i++){
            if(min.compareTo(a[i]) > 0){
                min = a[i];
            }
            if(max.compareTo(a[i]) < 0){
                max = a[i];
            }
        }
        return new Pair<>(min,max);
    }
}
*/
