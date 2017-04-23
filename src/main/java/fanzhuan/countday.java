package main.java.fanzhuan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * V1.0.0
 * Created by zhoumingkai on 2017/3/20.
 */
public class countday {
    /**
     * 获得指定日期的前一天
     * @param specifiedDay
     * @return
     * @throws Exception
     */
    public static String getSpecifiedDayBefore(String specifiedDay){
//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        Date date=null;
        try {
            date = new SimpleDateFormat("yy-MM-dd").parse(specifiedDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.setTime(date);
        int day=c.get(Calendar.DATE);
        c.set(Calendar.DATE,day-1);

        String dayBefore=new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
        return dayBefore;
    }
    /**
     * 获得指定日期的后一天
     * @param specifiedDay
     * @return
     */
    public static String getSpecifiedDayAfter(String specifiedDay){
        Calendar c = Calendar.getInstance();
        Date date=null;
        try {
            date = new SimpleDateFormat("yy-MM-dd").parse(specifiedDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.setTime(date);
        int day=c.get(Calendar.DATE);
        c.set(Calendar.DATE,day+1);

        String dayAfter=new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
        return dayAfter;
    }

    /**
     * 获取两个日期相差几个月
     * @author 石冬冬-Heil Hilter(dd.shi02@zuche.com)
     * @date 2016-11-30 下午7:57:32
     * @param start
     * @param end
     * @return
     */
    public static int getMonth(Date start, Date end) {
        if (start.after(end)) {
            Date t = start;
            start = end;
            end = t;
        }
        Calendar startCalendar = Calendar.getInstance();
        startCalendar.setTime(start);
        Calendar endCalendar = Calendar.getInstance();
        endCalendar.setTime(end);
        Calendar temp = Calendar.getInstance();
        temp.setTime(end);
        temp.add(Calendar.DATE, 1);

        int year = endCalendar.get(Calendar.YEAR) - startCalendar.get(Calendar.YEAR);
        int month = endCalendar.get(Calendar.MONTH) - startCalendar.get(Calendar.MONTH);

        if ((startCalendar.get(Calendar.DATE) == 1)&& (temp.get(Calendar.DATE) == 1)) {
            return year * 12 + month + 1;
        } else if ((startCalendar.get(Calendar.DATE) != 1) && (temp.get(Calendar.DATE) == 1)) {
            return year * 12 + month;
        } else if ((startCalendar.get(Calendar.DATE) == 1) && (temp.get(Calendar.DATE) != 1)) {
            return year * 12 + month;
        } else {
            return (year * 12 + month - 1) < 0 ? 0 : (year * 12 + month);
        }
    }

    public static Object countTwoDayWeek(Object startDate, Object endDate)
    {
/*        if(StringUtils.isNotEmpty(startDate) && StringUtils.isNotEmpty(endDate))
        {*/
            Date start=(Date)startDate;
            Date end = (Date)endDate;
            Calendar cal=Calendar.getInstance();
            cal.setTime(start);
            long time1=cal.getTimeInMillis();
            cal.setTime(end);
            long time2=cal.getTimeInMillis();
            long between_days=(time2-time1)/(1000*3600*24);
            Double days=Double.parseDouble(String.valueOf(between_days));
            if((days/7)>0 && (days/7)<=1){
                //不满一周的按一周算
                return 1;
            }else if(days/7>1){
                int day=days.intValue();
                if(day%7>0){
                    return day/7+1;
                }else{
                    return day/7;
                }
            }else if((days/7)==0){
                return 0;
            }else{
                //负数返还null
                return null;
            }
        }
    /*}*/
}
