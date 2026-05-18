package chapter13.Homework;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author hoengjing
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework04 {
    public static void main(String[] args) {
        HashSet set = new HashSet<>();
        Person p1 = new Person(1001,"AA");
        Person p2 = new Person(1002,"BB");

        set.add(p1);//ok 用旧 hash 存储
        set.add(p2);//ok
        System.out.println("添加前 p1 的 hashcode：" + p1.hashCode());
        //一旦修改参与了hashCode的计算，会导致哈希值发生改变
        p1.name = "CC"; //此时hashCode发生变换，但是对象还在原来的位置hashCode位置没动，value
        set.remove(p1); //remove的时候删除的是新的hashCode位置，所以原来位置hashCode信息并没有被删除
        System.out.println("添加后 p1 的 hashcode：" + p1.hashCode());
        System.out.println(set);
        set.add(new Person(1001,"CC"));
        System.out.println(set);
        set.add(new Person(1001,"AA"));
        System.out.println(set);//有4个对象，为什么

    }
}

class Person{
    public int id;
    public String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}