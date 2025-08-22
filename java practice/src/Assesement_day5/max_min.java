package Assesement_day5;

import java.util.function.BiFunction;

public class max_min {

	public static void main(String[] args) {
		
		  BiFunction<Integer, Integer, Integer> max = (a, b) -> Math.max(a, b);
	        BiFunction<Integer, Integer, Integer> min = (a, b) -> Math.min(a, b);

	        System.out.println("Max: " + max.apply(10, 20));
	        System.out.println("Min: " + min.apply(10, 20));
	}

}
