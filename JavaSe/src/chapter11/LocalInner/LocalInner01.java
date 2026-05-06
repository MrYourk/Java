package chapter11.LocalInner;

public class LocalInner01 {
    public static void main(String[] args) {
        Local local = new Local();
        local.m1();
    }


}

class Local{

    private int n = 10;

    public void m2(){
        System.out.println("this is m2");
    }

    public void m1(){
        final class Inter{ //2. 不能添加修饰符，可以使用final修饰，因为他是一个局部变量

            public void f1(){//局部内部类可以直接访问内部成员
                System.out.println("n1" + n);
                m2();
            }
        }
        Inter inter = new Inter();
        inter.f1();
    }
}
