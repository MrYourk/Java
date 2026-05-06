package chapter11.LocalInner;

public class InnerClassExercise {
    public static void main(String[] args) {
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("匿名内部类，只调用一次");
            }
        });
    }
    public static void f1(IL il){
        il.show();
    }
}

interface IL{
    void show();
}
