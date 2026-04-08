package chapter11.static_;

public class ChildGame {
    public static void main(String[] args) {
        int count = 0;
        Child child = new Child("孙悟空");
        child.join();
        count++;
        Child child1 = new Child("猪八戒");
        child1.join();
        count++;
        Child child2 = new Child("唐僧");
        child2.join();
        count++;

        System.out.println("共有" + count + "个人加入了游戏");
    }
}
class Child{
    private String name;
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join(){
        System.out.println(name + "加入了游戏");
    }
}
