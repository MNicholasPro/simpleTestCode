package main.java.fanzhuan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/3/20.
 */
public class getMonth {
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();

        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse("2017-03-09");
            cal.setTime(date);
            int month = cal.get(Calendar.MONTH); //注意月份是从0开始的,比如当前7月，获得的month为6
            cal.add(Calendar.MONTH,5);
            System.out.println(cal.get(Calendar.MONTH));
        }
        catch (ParseException e)
        {
            System.out.println(e.getMessage());
        }
/*        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse("2017-03-09");
            cal.setTime(date);
            cal.add(Calendar.WEEK_OF_YEAR,5);
            System.out.println(sdf.format(cal.getTime()));
        }
        catch (ParseException e)
        {
            System.out.println(e.getMessage());
        }*/

    }
}
