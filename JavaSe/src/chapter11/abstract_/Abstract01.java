package chapter11.abstract_;

public class Abstract01 {
    public static void main(String[] args) {
//        A a = new A(); 抽象类不能被实例化
    }

}

abstract class A{
    private String name;

    public A(String name) {
        this.name = name;
    }
}
