package chapter12.String_;

/**
 * @author hoengjing
 * @version 1.0
 */
public class StringMethod {
    public static void main(String[] args) {

        String s1 = "宝玉 and 薛宝钗 薛宝钗";
        s1 = s1.replace("薛宝钗","林黛玉");
        System.out.println(s1);
    }
}
