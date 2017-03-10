package riqiTest;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/3/7.
 */
public class ddd {

    public enum Day {
        a,b,c,d;
    }

    public String tellItLikeItIs(Day day) {
        String aa = null;
        switch (day) {
            case a:
                aa = "a";
                break;

            case b:
                aa = "b";
                break;

            case c:
                aa = "c";
                break;

            case d:
                aa = "d";
                break;

            default:
                System.out.println("Choose one.");
                break;
        }
        return aa;
    }

}
