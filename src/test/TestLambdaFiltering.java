package test;

import java.util.ArrayList;
import java.util.List;

import filtering.LambdaFiltering;

public class TestLambdaFiltering {

	public static void main(String[] args) {
		List<Integer> ages = new ArrayList<Integer>();
		ages.add(1);
		ages.add(89);
		ages.add(20);
		ages.add(21);
		ages.add(22);
		ages.add(32);
		ages.add(50);

		System.out.println(" ## PRINTING INITIAL AGES ##");
		ages.forEach(age -> System.out.println(age));
		
		ages = LambdaFiltering.filterPeopleOfAge(ages);
		
		System.out.println(" ## PRINTING FILTERED AGES ##");
		ages.forEach(age -> System.out.println(age));
	}

}
