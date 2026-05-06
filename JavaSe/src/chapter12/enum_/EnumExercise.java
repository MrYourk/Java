package chapter12.enum_;

/**
 * @author hoengjing
 * @version 1.0
 */
public class EnumExercise {
    public static void main(String[] args) {
        Week[] values = Week.values();

        for (Week week : values ){
            System.out.println(week.toString());
        }
    }
}

enum Week{
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),YHURSDAT("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期天");

    private String week;

    Week(String week) {
        this.week = week;
    }

    @Override
    public String toString() {
        return "Week{" +
                "week='" + week + '\'' +
                '}';
    }
}
