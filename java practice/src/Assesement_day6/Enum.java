package Assesement_day6;

public class Enum {
	enum Day{Sunday,monday,tuesday,wednesday,thursday,friday,saturday}

	public static void main(String[] args) {
		Day today  = Day.Sunday;
		switch(today) {
		case Sunday:System.out.println("Sunday");
		break;
		case monday:System.out.println("monday");
		break;
		case tuesday:System.out.println("Sunday");
		break;
		case wednesday:System.out.println("wednsday");
		break;
		case thursday:System.out.println("thursday");
		break;
		case friday:System.out.println("friday");
		break;
		case saturday:System.out.println("saturday");
		break;
		}
		if(today==Day.saturday || today==Day.Sunday){
			System.out.println("weakend");
		}
		else {
			System.out.println("weekday");
		}
	}

}
