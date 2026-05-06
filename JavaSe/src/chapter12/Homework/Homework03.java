package chapter12.Homework;

import java.util.Arrays;

/**
 * @author hoengjing
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        String name = "Han shun ping";

        String[] str = name.split(" ");

        String format = String.format("%s,%s .%c", str[2], str[0], str[1].toUpperCase().charAt(0));
        System.out.println(format);


    }

}
