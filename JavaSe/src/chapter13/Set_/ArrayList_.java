package chapter13.Set_;

import chapter12.enum_.Person;

/**
 * @author hoengjing
 * @version 1.0
 */
public class ArrayList_ {
    public static void main(String[] args) {
      Dog dog = new Dog("小美",3);
      Dog dog1 = new Dog("小何",4);
    }
}
class Dog{
    private String name;
    private int age;
    public void dogInfo(){
        System.out.println(this.name + "\t" + this.age + "\t");
    }
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
