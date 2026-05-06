package chapter11.final_;

public class FinalExercise02 {
    public static void main(String[] args) {


    }
}
class Something{
    public int addOne(final int x){
//        ++x; final不能被修改
        return x+1;//正确
    }
}
