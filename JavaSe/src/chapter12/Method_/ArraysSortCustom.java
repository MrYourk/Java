package chapter12.Method_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author hoengjing
 * @version 1.0
 */
public class ArraysSortCustom {
    public static void main(String[] args) {
        int[] arr = {1,0,23,-1,88,91};
//        bubble01(arr);
        bubble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println("排序后的值"+ Arrays.toString(arr));

    }
    public static void bubble01(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j< arr.length-1-i; j++){
                //从小到大
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //结合冒泡 + 定制

    public static  void bubble02(int[] arr, Comparator c){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j< arr.length-1-i; j++){
                //排序由c.compare(arr[j], arr[j + 1]) 返回的值决定
                if (c.compare(arr[j], arr[j + 1]) > 0){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
