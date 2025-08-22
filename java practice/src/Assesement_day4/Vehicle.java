package Assesement_day4;

class Vehicle {
    void displayVehicle() {
        System.out.println("This is a Vehicle");
    }
}

// Intermediate class 1
class Four_wheeler extends Vehicle {
    void displayFourWheeler() {
        System.out.println("This is a Four Wheeler");
    }
}

// Intermediate class 2
class Petrol_Four_Wheeler extends Four_wheeler {
    void displayPetrolFourWheeler() {
        System.out.println("This is a Petrol Four Wheeler");
    }
}

// Intermediate class 3
class FiveSeater_Petrol_Four_Wheeler extends Petrol_Four_Wheeler {
    void displayFiveSeaterPetrolFourWheeler() {
        System.out.println("This is a Five Seater Petrol Four Wheeler");
    }
}

// Derived class
class Baleno_FiveSeater_Petrol_Four_Wheeler extends FiveSeater_Petrol_Four_Wheeler {
    void displayBaleno() {
        System.out.println("This is a Baleno Five Seater Petrol Four Wheeler");
    }

	public static void main(String[] args) {
		  Baleno_FiveSeater_Petrol_Four_Wheeler baleno = new Baleno_FiveSeater_Petrol_Four_Wheeler();
	        baleno.displayVehicle();
	        baleno.displayFourWheeler();
	        baleno.displayPetrolFourWheeler();
	        baleno.displayFiveSeaterPetrolFourWheeler();
	        baleno.displayBaleno();
	    }
	}

		

	