package chapter13.Set_;

import java.util.*;

/**
 * @author hoengjing
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSetMethod {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put("k","v");
        //1. 增强for，不建议使用，效率低
        Set setKey = hashMap.keySet();
        for (Object object : setKey) {
            System.out.println(object);
        }
        //2. 迭代器
        Iterator iterator = setKey.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        //3. 通过entrySet 来获取 k-v,最常用
        Set entrySet = hashMap.entrySet();
        for (Object object : entrySet) {
            Map.Entry m = (Map.Entry)object;
            System.out.println(m.getKey()+ "-" + m.getValue());
        }

        //3. 取出所有value
        Collection values = hashMap.values();


    }
}
