package diedaiqi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by April_Chou on 2017/5/2.
 */
public class dieDaiqi {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("aa");
        l.add("bb");
        l.add("cc");
        for (Iterator iter = l.iterator(); iter.hasNext();) {
            String str = (String)iter.next();
            System.out.println(str);
        }
    }
}
