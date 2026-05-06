package chapter11.abstract_;

public class Abstract02 {
}
abstract class B{
    private int age;

    public B(int age) {
        this.age = age;
    }
    public void showDetail(){
        System.out.println("抽象类不一定包含abstract方法，也可以没有abstract方法");
    }
    public abstract void show(); //一旦类包含了abstract方法，这个类必须声明未abstract类
}
