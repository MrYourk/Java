package chapter11.abstract_;

public class Abstract04 {
}

class E extends F{//如果一个类继承了抽象类，必须要实现所有抽象方法，如果不实现，自己也需要声明未抽象类

    @Override
    public void show() {

    }
}

abstract class F{
    public abstract void show();
    public void test(){}


//    private abstract void testTing();//抽象方法不能使用private static final关键字修饰，因为这与抽象类的重写机制都是违背的
}
