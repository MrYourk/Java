package chapter11.LocalInner;

import org.w3c.dom.ls.LSOutput;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.show();
    }
}

class Outer05{
    private String name;
    private int n = 10;

    public void show(){

        new Person(){
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了 hi方法");
            }

            @Override
            public void ok(String str) {
                System.out.println("匿名内部类的ok" + str);
                super.ok(str);
            }
        }.ok("jack");
    }
}

class Person{
    public void hi(){
        System.out.println("Person hi()");
    }
    public void ok(String str){
        System.out.println("OK" + str);
    }
}