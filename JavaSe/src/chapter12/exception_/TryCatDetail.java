package chapter12.exception_;

/**
 * @author hoengjing
 * @version 1.0
 */
public class TryCatDetail {
    public static void main(String[] args) {
        //1. 如果发生异常，异常后面的代码不会执行，直接接入catch块
        //2. 如果没有异常，执行try后，不会进入catch代码块
        //3. 如果不管是否发生异常，都执行某段代码，使用finally
        try {
            String str = "国家";
            int a = Integer.parseInt(str);
            System.out.println("数字" + a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息" + e.getMessage());
        } finally {
            System.out.println("finally被执行了");
        }
        System.out.println("程序继续执行");
    }
}
