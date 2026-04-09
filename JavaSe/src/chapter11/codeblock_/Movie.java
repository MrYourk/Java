package chapter11.codeblock_;

public class Movie {
    private String name;
    private double price;
    private String director;

    {
        System.out.println("测试代码块");
        System.out.println("测试代码块");
    }
    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
