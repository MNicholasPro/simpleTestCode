package main.java.fanzhuan;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/3/22.
 */
public class DateMonths {
        private static String firstDay;
        private static String lastDay;
        public static void main(String[] args) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            //获取前月的第一天
            Date date1 = new Date();

            //获取前月的最后一天
            Calendar cale = Calendar.getInstance();
/*            try{
                date1 = format.parse("2017-06-03");
            }catch (ParseException e) {
                e.printStackTrace();
            }*/
            cale.setTime(date1);
            cale.add(Calendar.WEEK_OF_MONTH, 1);
            cale.set(Calendar.DAY_OF_WEEK,0);//设置为1号,当前日期既为本月第一天
            lastDay = format.format(cale.getTime());
            System.out.println("周:"+lastDay);



            /*for (int i = 0; i < 7; i++){
                Integer count1 = -i;
                Integer count2 = 1 - i;
                Calendar cal_1=Calendar.getInstance();//获取当前日期
                try{
                    date1 = format.parse("2017-06-03");
                }catch (ParseException e) {
                    e.printStackTrace();
                }
                cal_1.setTime(date1);
                cal_1.add(Calendar.MONTH, count1);
                cal_1.main.java.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
                firstDay = format.format(cal_1.getTime());
                System.out.println("-----1------firstDay:"+firstDay);


                //获取前月的最后一天
                Calendar cale = Calendar.getInstance();
                try{
                    date1 = format.parse("2017-06-03");
                }catch (ParseException e) {
                    e.printStackTrace();
                }
                cale.setTime(date1);
                cale.add(Calendar.MONTH, count2);
                cale.main.java.set(Calendar.DAY_OF_MONTH,0);//设置为1号,当前日期既为本月第一天
                lastDay = format.format(cale.getTime());
                System.out.println("-----2------lastDay:"+lastDay);
            }*/


/*            //获取当前月第一天：
            Calendar c = Calendar.getInstance();
            c.add(Calendar.MONTH, 0);
            c.main.java.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
            String first = format.format(c.getTime());
            System.out.println("===============first:"+first);

            //获取当前月最后一天
            Calendar ca = Calendar.getInstance();
            ca.main.java.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
            String last = format.format(ca.getTime());
            System.out.println("===============last:"+last);

        }
        *//**
         * 字符串的日期格式的计算
         *//*
        public static int daysBetween(String smdate,String bdate) throws ParseException {
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            Calendar cal = Calendar.getInstance();
            cal.setTime(sdf.parse(smdate));
            long time1 = cal.getTimeInMillis();
            cal.setTime(sdf.parse(bdate));
            long time2 = cal.getTimeInMillis();
            long between_days=(time2-time1)/(1000*3600*24);
            return Integer.parseInt(String.valueOf(between_days));*/
        }
    }

