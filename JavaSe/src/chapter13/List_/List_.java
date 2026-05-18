package chapter13.List_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hoengjing
 * @version 1.0
 */
public class List_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("zhangsanf");
        list.add("jiabaoyu");
        list.add(0,"yangxiangxiang");
        System.out.println("list = " + list);

        List list2 = new ArrayList();
        list2.add("jac");
        list2.add("tom");
        list.add(1,list2);
        System.out.println("list2 = " + list);
    }
}
