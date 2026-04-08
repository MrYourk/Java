package chapter11.static_;

public class StatusExercise02 {
    public static void main(String[] args) {
        System.out.println("Number of total is " + Person.getTotalPerson());//0
        Person p1 = new Person();
        System.out.println("Number of total is " + Person.getTotalPerson());//1
    }
}
class Person{
    private int id;
    private static int total = 0;

    public static int getTotalPerson(){

        return total;
    }

    public Person() {
        total++;
        total = id;
    }
}