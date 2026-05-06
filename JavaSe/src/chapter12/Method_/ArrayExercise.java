package chapter12.Method_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author hoengjing
 * @version 1.0
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦123",100);
        books[1] = new Book("金瓶梅1",90);
        books[2] = new Book("青年文摘555期刊",5);
        books[3] = new Book("西游记",300);

//        Arrays.sort(books, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {//这里就是book数组对象
//                Book b1 = (Book) o1;
//                Book b2 = (Book) o2;
//                double result = b2.getPrice()-b1.getPrice();
//
//                if (result > 0){
//                    return 1;
//                } else if (result < 0){
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        });
//        System.out.println(Arrays.toString(books));
        //按照书名长度从小到大

        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1 = (Book) o1;
                Book b2 = (Book) o2;
                return   b1.getName().length()-b2.getName().length();
            }
        });
        System.out.println(Arrays.toString(books));
    }
}

class Book{
    private String name;
    private double price;

    public Book(String name, double price) {
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
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}