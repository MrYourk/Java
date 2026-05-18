package chapter13.ArrayList_;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @author hoengjing
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ArrayListSource {
    public static void main(String[] args) {
        //1. 无参构造器，默认elementDat = 10;
        ArrayList arrayList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }
        //2. 超出10再次扩容
        for (int i = 11; i <= 15; i++) {
            arrayList.add(i);
        }
        //3. 超出当前elementData，再次过扩容
        arrayList.add(100);
        arrayList.add(100);

        Vector vector = new Vector<>();
        for (int i = 1; i <= 10; i++) {
            vector.add(i);
        }
        vector.add("11");
        System.out.println(vector);
    }
}
