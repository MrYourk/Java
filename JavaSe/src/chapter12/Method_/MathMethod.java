package chapter12.Method_;

/**
 * @author hoengjing
 * @version 1.0
 */
public class MathMethod {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i >2 && i < 7){
                System.out.println((int)(2 + Math.random() * (7-2+1)));
            }

        }

    }
}
