package chapter13.Homework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author hoengjing
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework03 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("jack",650);
        map.put("tom",1200);
        map.put("smith",2900);

        //将jack的工资更改未2600
        map.put("jack",2600);

        System.out.println(map);
        //2. 将所有员工工资加薪100元
        Set entrySet = map.entrySet();
        for (Object object : entrySet) {
            Map.Entry entry = (Map.Entry) object;
            int value = (Integer) entry.getValue() + 100;
            entry.setValue(value);

        }

        System.out.println(map);

        for (Object object : entrySet) {
            Map.Entry entry = (Map.Entry) object;
            System.out.println(entry.getKey());
        }

        Collection collection = map.values();
        System.out.println(collection);
    }
}


