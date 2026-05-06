package chapter12.enum_;

/**
 * @author hoengjing
 * @version 1.0
 */
public class Homework07 {
    public static void main(String[] args) {
        Car2 car2 = new Car2(-1.2);
        car2.getAir().flow();

    }
}
class Car2{
    private double temperature;

    public Car2(double temperature) {
        this.temperature = temperature;
    }

    class Air{
        public void flow(){
            if (temperature > 40){
                System.out.println("大于40，吹冷气");
            }else if (temperature < 0){
                System.out.println("小于0 吹暖气");
            } else {
                System.out.println("关空调");
            }
        }
    }
    public Air getAir(){
        return new Air();
    }
}
