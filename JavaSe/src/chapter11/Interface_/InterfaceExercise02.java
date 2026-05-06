package chapter11.Interface_;

public class InterfaceExercise02 {
    public static void main(String[] args) {
        new C().Px();
    }

}
interface A{
    int x = 0;

}

class B{
    int x = 1;
}
class C extends B implements A{
    public void Px(){
        System.out.println(A.x);
    }

}
