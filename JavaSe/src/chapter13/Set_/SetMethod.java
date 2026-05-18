package chapter13.Set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author hoengjing
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class SetMethod {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("john");
        set.add("jack");
        set.add(null);
        set.add(null);
        Iterator iterator = set.iterator();
        for (Object obj : set) {
            System.out.println(obj);
        }

        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

    }
}
