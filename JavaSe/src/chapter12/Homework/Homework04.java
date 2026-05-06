package chapter12.Homework;

/**
 * @author hoengjing
 * @version 1.0
 */
public class Homework04 {
    /**
     * 输入输入字符串，判断里面有多少个大写字母，多少个小写字母，多少个数字
     */
    public static void main(String[] args) {
        String name = "jksdjfD23F";

        int numCount = 0;   // 数字
        int lowerCount = 0; // 小写字母
        int upperCount = 0; // 大写字母

        for (int i = 0; i < name.length(); i++){
            char c = name.charAt(i);

            // 判断数字：0-9
            if (c >= '0' && c <= '9'){
                numCount++;
            }
            // 判断小写字母：a-z
            else if (c >= 'a' && c <= 'z'){
                lowerCount++;
            }
            // 判断大写字母：A-Z
            else if (c >= 'A' && c <= 'Z') {
                upperCount++;
            }
        }

        System.out.println("有" + numCount + "个数字，" + lowerCount + "个小写字母，" + upperCount + "个大写字母");
    }
}
