package chapter12.enum_;

/**
 * @author hoengjing
 * @version 1.0
 */
public class VehiclesFactory {
    private static Horse horse = new Horse();
    public static Horse getHorse(){
        return horse;
    }

    public static Boat getBoat(){
        return new Boat();
    }
    public static Mountain getMountain(){
        return new Mountain();
    }
}
