package chapter12.Method_;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author hoengjing
 * @version 1.0
 */
public class Date01 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");

        System.out.println(dateFormat.format(d));

        //Calendar: 一堆方法
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

    }
}
