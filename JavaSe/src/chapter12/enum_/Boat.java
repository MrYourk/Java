package chapter12.enum_;

/**
 * @author hoengjing
 * @version 1.0
 */
public class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("特殊情况下使用船过河");
    }
}
