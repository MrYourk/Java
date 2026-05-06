package chapter11.Interface_;

public class InterfacePolyArr {
    public static void main(String[] args) {
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone();
        usbs[1] = new Camera();

        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();
            if (usbs[i] instanceof Phone){
                ((Phone) usbs[i]).call();
            }
        }
    }
}
interface Usb{
    void work();
}


class Phone implements Usb{

    @Override
    public void work() {
        System.out.println("This is Phone");

    }
    public void call(){
        System.out.println("This is Phone a call");
    }
}

class Camera implements Usb{
    @Override
    public void work() {
        System.out.println("This is camera");
    }
}