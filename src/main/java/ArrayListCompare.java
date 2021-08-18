import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F"));
		
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("E","F","A","B","C","D"));

		Collections.sort(l1);
		Collections.sort(l2);
		
		System.out.println(l1.equals(l2));
	}

}
