package chapter12.exception_;

/**
 * @author hoengjing
 * @version 1.0
 */
public class ArrayIndexOutException_ {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
