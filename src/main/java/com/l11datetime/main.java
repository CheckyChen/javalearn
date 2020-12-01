package com.l11datetime;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.*;

public class main {

    public static void main(String[] args) {

        Date dt = new Date();
        System.out.println(dt);
        System.out.println(dt.toString());

        Date dt1 = new Date(2020, 12, 2);
        System.out.println(dt.after(dt1)); // dt 在 dt1 之后返回true，否则返回false
        System.out.println(dt.before(dt1));// dt 在 dt1 之前返回true，否则返回false
        long timestamp = dt.getTime();// 返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
        System.out.println(timestamp);

        // 格式化时间为字符串
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"); // SSS 毫秒数
        String formatedDt = simpleDateFormat.format(dt);
        System.out.println(formatedDt);

        // 将字符串转为时间
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String str = "2020-11-30 11:11:11";
            Date date = format.parse(str); // 用这个方法，必须得捕捉异常处理
            System.out.println(date);
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }

        // Calendar 对日期进行操作
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(dt.getTime());
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH) + 1; // *********** 月份必须 +1 *************
        int day = calendar.get(calendar.DAY_OF_MONTH);
        int hour = calendar.get(calendar.HOUR_OF_DAY); // *********** 获取时间的小时 ************
        int minute = calendar.get(calendar.MINUTE);
        int second = calendar.get(calendar.SECOND);
        int millisecond = calendar.get(calendar.MILLISECOND);
        System.out.println(String.format("%s-%s-%s %d:%d:%d.%d", year, month, day, hour, minute, second, millisecond));

        calendar.add(Calendar.YEAR, 1); // 年份 +1
        calendar.add(Calendar.MONTH, 1);// 月份 +1
        calendar.add(Calendar.DAY_OF_MONTH, 1); // 日 +1
        calendar.add(Calendar.HOUR_OF_DAY, 1);
        calendar.add(Calendar.MINUTE, 5);
        calendar.add(Calendar.SECOND, 40);
        System.out.println(calendar.getTime());

        // GregorianCalendar是Calendar类的一个具体实现。
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(dt);
        year = gregorianCalendar.get(GregorianCalendar.YEAR);
        System.out.println(year);


        // 测量时间间隔
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(5 * 1000);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        long end = System.currentTimeMillis();
        long deltaTime = end - start;
        System.out.println("时间差(ms)为："+deltaTime);
    }


    /******************时间格式编码***********************/
    // y	四位年份	2001
    // M	月份	July or 07
    // d	一个月的日期	10
    // h	 A.M./P.M. (1~12)格式小时	12
    // H	一天中的小时 (0~23)	22
    // m	分钟数	30
    // s	秒数	55
    // S	毫秒数	234
    // E	星期几	Tuesday
    // D	一年中的日子	360
    // F	一个月中第几周的周几	2 (second Wed. in July)
    // w	一年中第几周	40
    // W	一个月中第几周	1
    // a	A.M./P.M. 标记	PM
    // k	一天中的小时(1~24)	24
    // K	 A.M./P.M. (0~11)格式小时	10
    // z	时区	Eastern Standard Time
}
