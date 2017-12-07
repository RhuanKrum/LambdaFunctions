package filtering;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaFiltering {
	
	/**
	 * Simple method to filter a list of Ages, returning only ages equal or greater than 21 by using Lambda 
	 * 
	 * @author Rhuan Krum
	 * @since 2017-12-07
	 * 
	 * @param ages - Raw List of ages (Integer)
	 * @return filteredAges - List of filtered ages
	 */
	public static List<Integer> filterPeopleOfAge (List<Integer> ages){
		List<Integer> filteredAges = new ArrayList<Integer>();
		
		// Create the filter itself
		Predicate<Integer> predicate = (age) -> age >= 21;
		
		// Iterate each age and validate their value, adding them to the new list in case of success
		ages.forEach(age -> {
			if(predicate.test(age)) filteredAges.add(age);
		});
	
		return filteredAges;
	}
}
