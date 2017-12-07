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
		
		System.out.println(" ### WORKING WITH ASC SORTED LIST ###");
		LambdaSorting.sortList(stringList, LambdaSortingOptions.ASC);
	
		// Lambda function to iterate on all the strings
		stringList.forEach(str -> System.out.println(str));

		System.out.println(" ### WORKING WITH DESC SORTED LIST ###");
		LambdaSorting.sortList(stringList, LambdaSortingOptions.DESC);

		// Lambda function to iterate on all the strings
		stringList.forEach(str -> System.out.println(str));
	}

}
