package chapter13.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author hoengjing
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework02 {
    public static void main(String[] args) {
        Car car = new Car("宝马",400000);
        Car car2 = new Car("宾利",5000000);

        List list = new ArrayList<>();
        list.add(car);
        list.add(car2);
        list.remove(car);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.clear();
        list.addAll(Arrays.asList(car,car2));
        list.containsAll(Arrays.asList(car));
        System.out.println( list.contains(car2));

        System.out.println(list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        for (Object show : list) {
            System.out.println(show);
        }


    }
}

class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
