package chapter12.enum_;

/**
 * @author hoengjing
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(100);
        System.out.println(car);//9.0white
        System.out.println(car1);//100white

    }
}
class Car{
    double price = 10;
    static String color = "white";

    @Override
    public String toString() {
        return price + "\t" + color;
    }

    public Car(double price) {
        this.price = price;
    }
    public Car(){
        this.price = 9;
        this.color = "red";
    }
}
