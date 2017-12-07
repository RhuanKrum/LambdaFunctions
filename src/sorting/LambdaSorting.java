package sorting;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSorting {

	/**
	 * Simple method to sort any list of strings ASC or DESC (according to parameters) by using Lambda 
	 * 
	 * @author Rhuan Krum
	 * @since 2017-12-07
	 * 
	 * @param stringList - Raw and unsorted List
	 * @param sortingOption - Sorting option available in the Enum LambdaSortingOptions
	 * @return stringList - Sorted list according to the parameters
	 */
	public static void sortList(List<String> stringList, LambdaSortingOptions sortingOption){
		
		Comparator<String> comparator = (var1, var2) ->{
			
			for(int i = 1; i <= var1.length()+1 && i <= var2.length()+1; i++) {
				
				// Words are equal between var1 and var2
				if(i > var1.length() && i > var2.length()) {
					return 0;
				}
				
				// var1 and var2 are similar, but var2 has more characters. So, var1 comes first
				else if(i > var1.length()) {
					return sortingOption == LambdaSortingOptions.ASC ? -1 : 1;
				}
				
				// var1 and var2 are similar, but var1 has more characters. So, var2 comes first
				else if(i > var2.length()) {
					return sortingOption == LambdaSortingOptions.ASC ? 1 : -1;
				}
				
				// var1 is higher than var2
				else if(var1.substring(i-1, i).compareToIgnoreCase(var2.substring(i-1, i)) > 0) {
					return sortingOption == LambdaSortingOptions.ASC ? 1 : -1;
				}
				
				// var1 is lower than var2
				else if(var1.substring(i-1, i).compareToIgnoreCase(var2.substring(i-1, i)) < 0) {
					return sortingOption == LambdaSortingOptions.ASC ? -1 : 1;
				}
				
				// var1 and var2 has the same characters, but var1 is uppercase and var2 is lowercase
				else if (Character.isUpperCase(var1.charAt(i-1)) && !Character.isUpperCase(var2.charAt(i-1))) {
					return sortingOption == LambdaSortingOptions.ASC ? 1 : -1;
				}

				// var1 and var2 has the same characters, but var2 is uppercase and var1 is lowercase
				else if (!Character.isUpperCase(var1.charAt(i-1)) && Character.isUpperCase(var2.charAt(i-1))) {
					return sortingOption == LambdaSortingOptions.ASC ? -1 : 1;
				}
			}
			
			return 0;
			
		};
		
		Collections.sort(stringList, comparator);;
	}
}
