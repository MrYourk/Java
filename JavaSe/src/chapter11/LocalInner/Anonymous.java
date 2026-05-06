package chapter11.LocalInner;

import java.util.Timer;

/**
 * 演示匿名内部类的使用
 */
public class Anonymous {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 {
    private int num = 10;
    public void method(){
        //基于接口的匿名内部类
        /*
        1. IA 是编译类型
        2. tiger 的编译类型就是匿名内部类 xxx=> Outer04$1
            class xxxx(Outer04$1) implements IA{
                @Override
                public void cry(){
                   System.out.println("老虎在叫唤");
                }
            }
        3. jdk底层在创建匿名内部类 Outer04$1 后立马就创建了 Outer04$1实例，并且把地址返回给tiger
        4. 匿名内部类使用一次，就不能使用
         */
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎在叫唤");
            }
        };
        System.out.println("tiger的运行类型 = " + tiger.getClass());
        tiger.cry();
    }
}

interface IA{
    public void cry();
}