package chapter13.Set_;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author hoengjing
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSetExercise {
    public static void main(String[] args) {
        Set hashSet = new HashSet();


        // 创建日期对象
        MyDate d1 = new MyDate(2000, 1, 1);
        MyDate d2 = new MyDate(1999, 5, 20);
        MyDate d3 = new MyDate(2000, 1, 1); // 和d1同一天

        // 员工1
        Employee e1 = new Employee("张三", 8000, d1);
        // 员工2：姓名不同、生日不同
        Employee e2 = new Employee("李四", 9000, d2);
        // 员工3：姓名和生日和e1完全一样，应该被去重，无法加入
        Employee e3 = new Employee("张三", 10000, d3);

        // 添加
        hashSet.add(e1);
        hashSet.add(e2);
        hashSet.add(e3); // 重复员工，添加失败

        // 遍历查看，只会有2个员工
        for (Object employee : hashSet) {
            System.out.println(employee);
        }

    }
}
class Employee{
    private String name;
    private int sal;

    private MyDate birthday;

    public Employee(String name, int sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(getName(), employee.getName()) && Objects.equals(getBirthday(), employee.getBirthday());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBirthday());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}


