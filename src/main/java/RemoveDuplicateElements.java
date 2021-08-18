import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//1. LinkedHashSet for removing duplicates from ArrayList
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,6,3,4,7,0,1,10,3,5,8,6));
		
		System.out.println(numbers);
		System.out.println("***********");
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
		
		ArrayList<Integer> uniques = new ArrayList<Integer>(linkedHashSet);
		
		System.out.println(uniques);
		System.out.println("***********");	
		
	//2. Stream 
		
		ArrayList<Integer> dups = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,6,3,4,7,0,1,10,3,5,8,6));
		
		List<Integer> unique = dups.stream().distinct().collect(Collectors.toList());
		
		System.out.println(unique);
		
		
	}

}
