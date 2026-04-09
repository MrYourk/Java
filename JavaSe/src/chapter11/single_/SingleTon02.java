package chapter11.single_;

public class SingleTon02 {
    public static void main(String[] args) {
        System.out.println(Cat.n1);
        Cat instance = Cat.getInstance();
        System.out.println(instance);
    }
}


class Cat{
    private String name;
    public static int n1 = 10;

    private static Cat cat;

    private Cat(String name){
        System.out.println("构造器被调用");
        this.name = name;
    }

    public static Cat getInstance(){
        if (cat == null) {
            cat = new Cat("laopo");
        }
        return cat;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
