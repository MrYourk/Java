package chapter11.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(1.5);
        System.out.println(circle.Radius() );
    }

}
class Circle{
    private final double PI = 3.14;

    private double radius;


    {
//        PI = 3.14;
    }

    public Circle(double radius) {
        this.radius = radius;
//        PI = 3.14;
    }

    public double Radius(){
        return radius*radius*PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
