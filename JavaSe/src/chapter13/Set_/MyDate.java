package chapter13.Set_;

/**
 * @author hoengjing
 * @version 1.0
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    // 构造器
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // getter
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    // 重写equals：年月日都相同 → 日期相同
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    // 重写hashCode
    @Override
    public int hashCode() {
        return java.util.Objects.hash(year, month, day);
    }
}