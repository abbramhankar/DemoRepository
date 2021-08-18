
public class Stringhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "My name is Anant Bramhankar";
		System.out.println(s);
		System.out.println(s.charAt(1));
		System.out.println();

		String str1 = "Learning";
		String str2 = new String("learning");
		String str3 = new String("Java Tutorial!");
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));

		System.out.println("");
		
		String str4 = new String("It is ok");
		String str5 = new String("It is ok");

		System.out.println(str1.contentEquals(str2));
		System.out.println(str5.contentEquals(str4));

		// String txt1 = "madam";
		// String txt2 = "madam";
		//
		// String txt3 = "";
		//
		// for (int i=txt1.length()-1; i>=0;i--) {
		// txt3= txt3+ txt1.charAt(i);
		// }
		// System.out.println(txt3);
		//
		// if(txt3.equals(txt2)) {
		// System.out.println("It is Palindrome");
		// }
		// }

	}
}
