package chapter12.Wrapper;

/**
 * @author hoengjing
 * @version 1.0
 */
public class WrapperExercise {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(2);
        System.out.println(i == j);

        Integer m = 1;
        Integer  n = 1;
        System.out.println(m == n);

        //127是true,128是false
        Integer x = 127;
        Integer y = 127;
        System.out.println(x == y);
    }
}
