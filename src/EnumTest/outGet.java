package EnumTest;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/3.
 */
public class outGet {
    public static  void main(String[] args){
//        System.out.println(Size.values());
        for(Size a : Size.values()){
            EnumTestRO aa = new EnumTestRO();
            aa.setAbbreviation(a.getAbbreviation());
            aa.setCode(a.getCode());
            System.out.println(aa);
        }
    }
}
