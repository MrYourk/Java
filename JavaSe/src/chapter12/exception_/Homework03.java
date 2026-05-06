package chapter12.exception_;

/**
 * @author hoengjing
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        if(args[4].equals("john")){
            System.out.println("AA");
        } else {
            System.out.println("bb");
        }
        Object o = args[2];
        Integer i = (Integer) o;
    }
}
