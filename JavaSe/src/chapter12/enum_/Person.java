package chapter12.enum_;

/**
 * @author hoengjing
 * @version 1.0
 */
public class Person {
    private String name;
    public Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void getBoat(){
        if (!(vehicles instanceof Boat)){
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();

    }
    public void common(){
        if (!(vehicles instanceof Horse)){
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();
    }
    public void getMountain(){
        if (!(vehicles instanceof Mountain)){
            vehicles = VehiclesFactory.getMountain();
        }
        vehicles.work();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicles getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicles vehicles) {
        this.vehicles = vehicles;
    }
}
