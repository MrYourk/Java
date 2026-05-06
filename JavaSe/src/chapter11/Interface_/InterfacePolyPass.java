package chapter11.Interface_;

/**
 * 演示多态传递
 */
public class InterfacePolyPass {
    public static void main(String[] args) {
        //实现接口的类，接口可以指向该类
        IG ig = new AA();
        IH ih = new AA();
    }
}

interface IH{}
interface IG extends IH{}//IG 继承了AA，相当与AA也实现了IH

class AA implements IG{}
