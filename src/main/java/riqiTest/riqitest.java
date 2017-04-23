package main.java.riqiTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/3/7.
 */
public class riqitest {
    public static void main(String[] args) {
        Calendar cal1 = Calendar.getInstance();// 使用默认时区和语言环境获得一个日历
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");// 通过格式化输出日期

        cal1.add(Calendar.DAY_OF_MONTH, 0);// 取当前日期的前1天.
        System.out.println("+++++++++++++++++++++++++++" + format.format(cal1.getTime()));


        cal1.add(Calendar.DAY_OF_MONTH, -1);// 取当前日期的前1天.
        String beforeDay1 = format.format(cal1.getTime());
        cal1.add(Calendar.DAY_OF_MONTH, -1);// 取当前日期的前2天.
        String beforeDay2 = format.format(cal1.getTime());
        System.out.println("beforeDay1::" + beforeDay1);
        System.out.println("beforeDay2::" + beforeDay2);

        Calendar cal7 = Calendar.getInstance();// 使用默认时区和语言环境获得一个日历
        cal7.add(Calendar.DAY_OF_MONTH, -7);// 取当前日期的前7天.
        String beforeDay7 = format.format(cal7.getTime());
        cal7.add(Calendar.DAY_OF_MONTH, -7);// 取当前日期的前14天.
        String beforeDay14 = format.format(cal7.getTime());
        System.out.println("beforeDay7::" + beforeDay7);
        System.out.println("beforeDay14::" + beforeDay14);

        Calendar cal30 = Calendar.getInstance();// 使用默认时区和语言环境获得一个日历
        cal30.add(Calendar.DAY_OF_MONTH, -30);// 取当前日期的前30天.
        String beforeDay30 = format.format(cal30.getTime());
        cal30.add(Calendar.DAY_OF_MONTH, -30);// 取当前日期的前60天.
        String beforeDay60 = format.format(cal30.getTime());
        System.out.println("beforeDay30::" + beforeDay30);
        System.out.println("beforeDay60::" + beforeDay60);
    }
}
