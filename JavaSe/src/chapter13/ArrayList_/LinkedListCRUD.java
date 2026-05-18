package chapter13.ArrayList_;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Vector;

/**
 * @author hoengjing
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class LinkedListCRUD {
    public static void main(String[] args) {
        //1. 第一次扩容默认10
        Vector vector = new Vector();
        Set set = new HashSet<>();
        set.add("1234");
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        //2. 大于10再次扩容
        vector.add(12);
    }
}
