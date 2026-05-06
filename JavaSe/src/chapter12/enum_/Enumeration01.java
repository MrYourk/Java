package chapter12.enum_;

/**
 * @author hoengjing
 * @version 1.0
 */
public class Enumeration01 {
}


enum Season {



//    public static Season SPRING = new Season("春天","1");
//    public static Season WINTER = new Season("冬天","2");
//    public static Season AUTUMN = new Season("秋天","3");
//    public static Season SUMMER = new Season("夏天","4");

    //enum实现
    SPRING("春天","1"),
    WINTER("冬天","2"),
    AUTUMN("秋天","3"),
    SUMMER("夏天","4");

    private String name;
    private String desc;


    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName()  {
        return name;
    }
    public String getDesc() {
        return desc;
    }
}
