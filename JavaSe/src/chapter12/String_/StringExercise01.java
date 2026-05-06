package chapter12.String_;

/**
 * @author hoengjing
 * @version 1.0
 */
public class StringExercise01 {
    public static void main(String[] args) {
        String s1 = "hspedu";//直接指向常量池
        String s2 = "java";
        String s3 = "java";
        String s4 = new String("java");
        System.out.println(s2 == s3);//true
        System.out.println(s2 == s4);//false s4指向的是堆中的value，value指向常量池
        System.out.println(s2.equals(s3));//true
        System.out.println(s1 == s2);//false
    }
}
