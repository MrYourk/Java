package chapter12.String_;

/**
 * @author hoengjing
 * @version 1.0
 */
public class StringBufferExercise01 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer s1 = new StringBuffer(str);
        s1.append(str);
        System.out.println(s1.length());//1

        System.out.println(str);

        StringBuffer s2 = new StringBuffer(str);
        System.out.println(s2);
    }
}
