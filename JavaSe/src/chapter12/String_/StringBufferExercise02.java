package chapter12.String_;

/**
 * @author hoengjing
 * @version 1.0
 */
public class StringBufferExercise02 {
    public static void main(String[] args) {
        String price = "12334342545.56";
        StringBuffer sb = new StringBuffer(price);


        for (int i = sb.lastIndexOf(".") - 3; i > 0; i -= 3){
            sb = sb.insert(i, ",");
        }
        System.out.println(sb);
    }
}
