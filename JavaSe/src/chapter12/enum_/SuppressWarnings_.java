package chapter12.enum_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hoengjing
 * @version 1.0
 */
public class SuppressWarnings_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("jack");
        list.add("tom");
        int i;
        System.out.println(list.get(1));
    }
}
