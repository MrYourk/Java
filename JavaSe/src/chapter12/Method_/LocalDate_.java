package chapter12.Method_;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author hoengjing
 * @version 1.0
 */
public class LocalDate_ {
    public static void main(String[] args) {
        //第三代日期
        LocalDateTime localDateTime = LocalDateTime.now();//LocalDate.now() LocalTime.now()
        System.out.println(localDateTime);
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonthValue());

        //格式化日期
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh:ss");
        System.out.println(dateTimeFormatter.format(localDateTime));

        //时间戳
        Instant now = Instant.now();
        System.out.println(now);
        Date date = Date.from(now);
        System.out.println(date);


    }
}
