package chapter12.enum_;

/**
 * @author hoengjing
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();

        /*
        1. 匿名内部类，同时也是个对象
        new Computer() {
            @Override
            public double work(double n1, double n2) {
                return n1*n2;
            }
        2. 编译类型是computer,运行类型是匿名内部类
         */
        cellphone.testWork(new Computer() {
            @Override
            public double work(double n1, double n2) {
                return n1*n2;
            }
        },10,20);
    }
}

interface Computer{
    double work(double n1, double n2);
}
class Cellphone {

    public void testWork(Computer computer, double n1, double n2) {
        double result = computer.work(n1,n2);
        System.out.println("计算后的结果是=" + result);
    }
}
