package chapter13.Collection_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author hoengjing
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Collections_ {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("tom");
        list.add("smish");
        list.add("king");
        list.add("milan");
        list.add("tom");
        //反转List集合数据
        Collections.reverse(list);
        for (int i = 0; i < 5; i++) {
            //对集合中的元素随机排序
            Collections.shuffle(list);
        }
        //自然排序（升序）
        Collections.sort(list);
        //根据知道的comparator产生的顺序对list集合进行排序
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });

        //将指定list集合中的i元素和j处元素进行交换
        Collections.swap(list,3,1);
        System.out.println(list);

    }
}
