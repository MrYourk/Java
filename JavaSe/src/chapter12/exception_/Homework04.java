package chapter12.exception_;

/**
 * @author hoengjing
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        try {
            func();//抛出异常，异常后的代码不再执行
            System.out.println("A");
        } catch (Exception e){//捕获异常
            System.out.println("C");//处理异常并执行
        }
        System.out.println("D");//处理异常后，不阻塞登录

    }

    public static void func(){
        try {
            throw new RuntimeException();
        }finally {
            System.out.println("B");//1
        }
    }
}
