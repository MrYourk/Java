package chapter11.LocalInner;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();

        /*
        1. 传递的是实现接口的匿名内部类
        2. 匿名内部类重写了ring方法
        3. bell = new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪床了");
            }
            }
         */
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪床了");
            }
        });
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}

interface Bell{
    void ring();
}

class CellPhone{
    public void alarmClock(Bell bell){
        System.out.println(bell.getClass());
        bell.ring();//动态绑定，编译类型是bell，但是运行类型是动态的
    }
}
