package chapter11.codeblock_;

public class CodeBlock02 {
    public static void main(String[] args) {
        B02 b02 = new B02();
    }
}

class A02{//父类
    private static int n1 = getVal01();

    static {
        System.out.println("A02的一个静态代码块");//2
    }
    {
        System.out.println("A02的一个普通代码块");//5
    }
    public int n3 = getVal02();//
    public static int getVal01(){
        System.out.println("getVal01");//1
        return 10;
    }
    public int getVal02(){
        System.out.println("getVal02");//6
        return 10;
    }
    public A02(){
        System.out.println("A02的构造器");//7
    }
}

class B02 extends A02{
    private static int n3 = getVal03();
    static {
        System.out.println("B02的一个静态代码块");//4
    }
    public int n5 = getVal04();
    {
        System.out.println("B02的一个普通代码块");//9
    }
    public static int getVal03(){
        System.out.println("getVal03");//3
        return 10;
    }

    public int getVal04(){
        System.out.println("getVal04");//8
        return 10;
    }
    public B02(){
        //super()
        //子类的静态代码块和属性
        System.out.println("B02的无参构造器");//10
    }
}