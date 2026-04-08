package chapter11.static_;

public class StaticMethod {
    public static void main(String[] args) {
        B b1 = new B("tom");
        B b2 = new B("jack");
        b1.sum(100);
        b2.sum(500);
        B.show();
    }
}

class B{
    private String name;
    public static int fee = 0;

    public B(String name) {
        this.name = name;
    }
    public  void sum(int fee){
       B.fee += fee;
    }

    public static void show(){
        System.out.println("总学费" + B.fee);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

