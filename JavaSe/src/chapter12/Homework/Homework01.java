package chapter12.Homework;

/**
 * @author hoengjing
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        //字符串翻转，将“abcdef 反转为 “aedcbf"
        String str = "abcdef";
        try {
            str = reverse(str,4,3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
         }
        System.out.println(str);
    }
    public static String reverse(String str, int start, int end){

        //对输入参数做验证
        //1. 先写出正确的情况在取反,思路不乱
        if (!(str!= null && start>=0 && end > start)){
           throw new RuntimeException("参数不正确");
        }
        char[] chars = str.toCharArray();
        char temp = ' ';
        for (int i = start, j = end; i < j; i++, j--){
            temp = chars[i];
            chars[i] = chars[i+1];
            chars[i+1] = temp;
        }
        return new String(chars);
    }
}
