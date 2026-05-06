package chapter12.exception_;

/**
 * @author hoengjing
 * @version 1.0
 */
public class NullPointerException_ {
    public static void main(String[] args) {
        String name = null;
        System.out.println(name.length());
    }
}
