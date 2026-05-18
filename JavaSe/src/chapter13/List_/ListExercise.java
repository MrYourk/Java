package chapter13.List_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author hoengjing
 * @version 1.0
 */
public class ListExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("string");
        list.add("remove");
        list.add("index");
        list.add("有序的");
        list.add("且重复的");
        list.add("collection单列集合");
        list.add("Map双列集合，key value存储");

        list.add(2,"学习中 ");
        System.out.println("list = " + list);


        System.out.println(list.get(5));
        System.out.println(list.remove(6));
        System.out.println("删除后的 = " + list);

        list.set(6,"map双列集合");
        System.out.println("list = " + list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("遍历后的结果=" + next);
        }

    }
}
