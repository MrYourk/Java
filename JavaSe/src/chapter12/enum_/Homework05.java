package chapter12.enum_;

/**
 * @author hoengjing
 * @version 1.0
 */
public class Homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.show();

    }
}

class A{
    private String name = "测试";
    public void show(){
        System.out.println(new B().name);
        new B().show();
    }
    class B{
        private final String name = "10";
        public void show(){
            System.out.println(A.this.name);
        }
    }
}
