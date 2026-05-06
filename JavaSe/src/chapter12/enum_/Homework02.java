package chapter12.enum_;

/**
 * @author hoengjing
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        Frock frock = new Frock();
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        System.out.println(frock.getSerialNumber());
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
    }
}
class Frock{
    private static int currentNum = 100000;
    private int serialNumber;
    public static int getNextNum (){
        return currentNum += 100;
    }

    public Frock() {
        serialNumber = getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Frock{" +
                "serialNumber=" + serialNumber +
                '}';
    }
}
