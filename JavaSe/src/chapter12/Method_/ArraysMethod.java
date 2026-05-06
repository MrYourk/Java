package chapter12.Method_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author hoengjing
 * @version 1.0
 */
public class ArraysMethod {
    public static void main(String[] args) {
        Integer arr[] = {1,-1,22,33,0,99};

        //默认排序方法
        //Arrays.sort(arr);
        //System.out.println("排序后的结果"+ Arrays.toString(arr));

        //定制排序
        //1. 实现了Comparator接口的匿名内部类
        //2. 最终到
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;

                return i2 - i1;
            }
        });

        System.out.println("排序后的结果"+ Arrays.toString(arr));
    }
}
