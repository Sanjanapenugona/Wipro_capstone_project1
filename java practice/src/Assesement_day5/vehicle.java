package Assesement_day5;
interface BaseVehicle {
    void start();
}

interface AdvancedVehicle extends BaseVehicle {
    void stop();
    boolean refuel(int amount);
}

class Car implements AdvancedVehicle {
    private int fuelLevel;

    public Car(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }


    public void start() {
        System.out.println("Car started");
    }


    public void stop() {
        System.out.println("Car stopped");
    }

   
    public boolean refuel(int amount) {
        fuelLevel += amount;
        System.out.println("Car refueled. Current fuel level: " + fuelLevel);
        return true;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }
}

public class vehicle {

	public static void main(String[] args) {
		  Car car = new Car(30);

	        BaseVehicle baseVehicle = car;
	        baseVehicle.start();

	      
	        AdvancedVehicle advancedVehicle = car;
	        advancedVehicle.stop();
	        advancedVehicle.refuel(20);

	        System.out.println("Current fuel level: " + car.getFuelLevel());
	    }
	}
