package chapter13.List_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hoengjing
 * @version 1.0
 */
public class ListExercise02 {

    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("hongloum","caoxueq",100));
        list.add(new Book("xiyouji","wuchengen",10));
        list.add(new Book("shuifuzhuan","shinaiy",9));
        list.add(new Book("sanguoyanyi","luoguanz",80));
        list.add(new Book("xiyouji","wuchengen",10));


        sort(list);
        for (Object book : list) {
            System.out.println(book);
        }


    }
    @SuppressWarnings({"all"})
    public static void sort(List list){
        int listsize = list.size();
        for (int i = 0; i < listsize - 1; i++) {
            for (int j = 0; j < listsize - 1 - i; j++) {
                //比较，取出价格,向下转型
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()){//交换
                    list.set(j, book2);
                    list.set(j+1,book1);
                }
            }
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

    @Override
    public String toString() {
        return "名称：" + name + "\t\t\t价格： " + price + "\t\t作者：" + author;
    }
}

