
public class StringManipulation {

	public static void main(String[] args) {

		String s = "geeksforgeeks";
		int count = 0;
		
		char[] str = s.toCharArray();
		
		for (int i=0; i< s.length(); i++) {
		count=1;
		for(int j=i+1; j<s.length(); j++) {
			
			if (str[i] == str[j]) {
				count++;
				str[j]='0';
			}
			
		}
		//System.out.println(str[i]+" has count :"+count);
		  if(count > 1 && str[i] != '0')  
              System.out.println(str[i]);	
		
		}
		String sum = "hello";
		String sum1 = "java";	
		
		
		
	}

}
