package chapter13.Collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author hoengjing
 * @version 1.0
 */
public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(new Book("luoguanzhong","1",11.2));
        collection.add(new Book("sdf","2",113));
        collection.add(new Book("gadsx","3",88.1));

        //1. 先得到Iterator迭代器
        Iterator iterator = collection.iterator();
        //2. 使用while遍历（快捷键 itit ctrl+j）
        while (iterator.hasNext()){//判断是否还有数据
            //返回下一个元素，类型是object
            Object object = iterator.next();
            System.out.println("obj = " + object);
        }
        //3. 当退出while循环后，这时iterator迭代器，指向最后的元素：new customer(),如果继续指向iterator.next 会提示异常
        //4. 如果希望再次遍历，需要重置迭代器

        for (Object book : collection) {
            System.out.println("book = " + book);
        }

    }
}

class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
