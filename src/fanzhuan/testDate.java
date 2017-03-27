package fanzhuan;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/3/21.
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class testDate {
    public static void main(String[] args) throws ParseException {
        /*当月第一天*/
/*  String str="2012-08-04";
  SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
    Calendar lastDate = Calendar.getInstance();
    lastDate.setTime(sdf.parse(str));

    lastDate.set(Calendar.DAY_OF_MONTH, 1);

    str = sdf.format(lastDate.getTime());
    System.out.println(str);*/


        /*当月最后一天*/
/*  String str="2019-04-05";
  SimpleDateFormat sdfDateFormat = new SimpleDateFormat("yyyy-MM-dd");
  Calendar lastDate = Calendar.getInstance();
  lastDate.setTime(sdfDateFormat.parse(str));
  lastDate.set(Calendar.DATE, 1);
  lastDate.add(Calendar.MONTH, 1);
  lastDate.add(Calendar.DATE, -1);
  str = sdfDateFormat.format(lastDate.getTime());
  System.out.println(str);*/

      String date="2017-03-22";
      Calendar week= Calendar.getInstance();
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      week.setTime(sdf.parse(date));
      week.add(Calendar.WEEK_OF_YEAR, 2);

        date = sdf.format(week.getTime());
        Calendar c = Calendar.getInstance() ;
        c.setTime(sdf.parse(date));
        c.set(Calendar.DAY_OF_WEEK, 1);
        date =sdf.format(c.getTime());
        System.out.println(date+"周中第一天");
        c.set(Calendar.DAY_OF_WEEK, 7);
        date = sdf.format(c.getTime());
        System.out.println(date+"周中最后一天");

/*        String date="2017-03-22";
        String date1="2017-03-22";
        Calendar week= Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        week.setTime(sdf.parse(date));
        week.add(Calendar.WEEK_OF_YEAR, -2);


        date = sdf.format(week.getTime());
        Calendar c = Calendar.getInstance() ;
        c.setTime(sdf.parse(date));
        c.set(Calendar.DAY_OF_WEEK, 1);
        date =sdf.format(c.getTime());
        System.out.println(date+"周中第一天");*/

/*
        Object a = countday.countTwoDayWeek(date,date1);
        System.out.println(a);
*/



/*        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//小写的mm表示的是分钟
        String dstr1="2017-03-05";
        String dstr2="2017-05-09";
        Date date1=sdf.parse(dstr1);
        Date date2=sdf.parse(dstr2);
        Integer a = countday.getMonth(date1,date2);
        System.out.println(a);*/
    }
}