package chapter11.final_;
public class FinalDetail01 {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.Show();
    }
}

final class AA extends BB { //3. final类不能被继承，但可以实力化对象
    //1.final修饰的属性在定义时，必须赋值并且以后不能被修改,赋值可以在如下位置
    //a. 定义时
    //b. 构造器中
    //c. 代码块中
    private final double MAX_HUB = 99;//a

    private final double MIN_HUB;//b
    private final int TAX_RATE;

    public AA() {
        MIN_HUB = 199;
    }

    {
        TAX_RATE = 122;
    }

//    @Override
//    public  void Show(){
//        System.out.println("show方法");
//    }
//}
}
class BB{
    //2. final修饰的变量是静态的，初始化的位置只能是
    //a. 定义时
    //b. 静态代码块,构造器无法赋值（静态变量在类加载时就生成了，构造器需要实例化对象才会被调用）
    private static final double MONEY = 100.00;//a
    private static final double MONEY_HOME;//b
    //private static final double TEST_FINAL;
    static {
        MONEY_HOME = 100;
    }

    public BB() {
        //TEST_FINAL = 100;
    }

    //5. final方法不能被重载重写，但是可以被继承
     public final void Show(){
         System.out.println("show方法");
    }
}
