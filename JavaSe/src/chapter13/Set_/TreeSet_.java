package chapter13.Set_;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author hoengjing
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TreeSet_ {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {

                return ((String)o1).length() - (((String)o2).length());
            }
        });

        treeMap.put("tom","tom");
        treeMap.put("hsp","tom");
        treeMap.put("1","1234");
        System.out.println(treeMap);

    }
}
