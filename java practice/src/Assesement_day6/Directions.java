package Assesement_day6;
enum Direction {
	 NORTH, SOUTH, EAST, WEST
}

public class Directions {

	public static void main(String[] args) {
		 String directionStr = "NORTH"; 
	        try {
	            Direction direction = Direction.valueOf(directionStr.toUpperCase());
	            switch (direction) {
	                case NORTH:
	                    System.out.println("Move north");
	                    break;
	                case SOUTH:
	                    System.out.println("Move south");
	                    break;
	                case EAST:
	                    System.out.println("Move east");
	                    break;
	                case WEST:
	                    System.out.println("Move west");
	                    break;
	            }
	        } catch (IllegalArgumentException e) {
	            System.out.println("Invalid direction: " + directionStr);
	        }
	    }
	}

