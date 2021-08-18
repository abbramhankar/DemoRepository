import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		
//		ArrayList<String> friends = new ArrayList<String>();
//		
//		friends.add("Anant");
//		friends.add("Neha");
//		friends.add("Smita");
//		friends.add("Aniket");
//		
//		//for loop
//		for(int i=0; i<friends.size(); i++) {
//			System.out.println(friends.get(i));
//		}
//		
//		System.out.println("*****************");
//		
//		//for each loop
//		for (String s : friends) {
//		System.out.println(s);
//		}
//		
//		System.out.println("*****************");
//		
//		//lambda with streams
//		friends.stream().forEach(ele -> System.out.println(ele));
//		
//		System.out.println("*****************");
//		
//		//Iterator
//		Iterator<String> it = friends.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		//Print ODD numbers from list of all using lambda
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers.removeIf(num -> num%2 == 0);
		System.out.println(numbers);
		
		//Print EVEN numbers from list of all using lambda
		
		ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers1.removeIf(num1 -> num1%2 == 1);
		System.out.println(numbers1);
		
	}

}
