package test;

import java.util.ArrayList;
import java.util.List;

import sorting.LambdaSorting;
import sorting.LambdaSortingOptions;

public class TestLambdaSorting {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();
		stringList.add("TESTING");
		stringList.add("aaa");
		stringList.add("CCC");
		stringList.add("ddd");
		stringList.add("AAA");
		stringList.add("aaA");
		stringList.add("bBb");
		stringList.add("BBB");
		stringList.add("BBb");
		stringList.add("zkoakzaokazo");
		stringList.add("ccc");
		stringList.add("EEE");
		stringList.add("eee");
		
		LambdaSorting.sortStringIgnoreCase(stringList, LambdaSortingOptions.ASC);
	
		System.out.println(" ### PRINTING ASC SORTED LIST ###");
		for(String string : stringList) {
			System.out.println(string);
		}

		System.out.println(" ### PRINTING DESC SORTED LIST ###");
		LambdaSorting.sortStringIgnoreCase(stringList, LambdaSortingOptions.DESC);
	
		for(String string : stringList) {
			System.out.println(string);
		}
	}

}
