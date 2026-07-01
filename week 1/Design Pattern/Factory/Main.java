interface Vehicle {
    void start();
}

class Car implements Vehicle {

    public void start() {
        System.out.println("Car Started");
    }
}

class Bike implements Vehicle {

    public void start() {
        System.out.println("Bike Started");
    }
}

class VehicleFactory {

    public Vehicle getVehicle(String type) {

        if(type.equalsIgnoreCase("Car")) {
            return new Car();
        }

        else if(type.equalsIgnoreCase("Bike")) {
            return new Bike();
        }

        return null;
    }
}

public class Main {

    public static void main(String[] args) {

        VehicleFactory factory = new VehicleFactory();

        Vehicle v1 = factory.getVehicle("Car");
        v1.start();

        Vehicle v2 = factory.getVehicle("Bike");
        v2.start();
    }
}