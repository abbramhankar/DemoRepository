
public class LoopTest {

	public static void main(String[] args) {

		int x, y, count=3;

		/*  	OUTPUT
		 *  	1 2 3 4
		 *  	5 6 7
		 *  	8 9
		 *  	10 
		 * */		
		//		for (x = 1; x <= 4; x++) {
		//			for (y = 4; y >= x; y--) {		//difference in inner loop
		//				System.out.print(count + " ");
		//				count++;
		//			}
		//			System.out.println();
		//		}

		/*  	OUTPUT
		 *  	1
		 *  	2 3
		 *  	4 5 6
		 *  	7 8 9 10
		 * */
		//		for (x = 1; x <= 4; x++) {
		//			for (y = 1; y <= x; y++) {		//difference in inner loop
		//				System.out.print(count + " ");
		//				count++;			//count inside inner loop
		//			}
		//			System.out.println();
		//		}

		/*  	OUTPUT
		 *  	1
		 *  	2 2
		 *  	3 3 3
		 *  	4 4 4 4
		 * */
		//		for (x = 1; x <= 4; x++) {
		//			for (y = 1; y <= x; y++) {
		//				System.out.print(count + " ");
		//			
		//			}
		//			count++;			// count outside inner loop
		//			System.out.println();
		//		}

		/*  	OUTPUT
		 *  	1 1 1 1
		 *  	2 2 2
		 *  	3 3 
		 *  	4
		 * */
		//		for (x = 1; x <= 4; x++) {
		//			for (y = 4; y >= x; y--) {
		//				System.out.print(count + " ");
		//			}
		//			count++;			// count outside inner loop
		//			System.out.println();
		//		}

		/*  	OUTPUT
		 *  	* * * *
		 *  	* * *
		 *  	* *
		 *  	*
		 * */
		//		for (x = 1; x <= 4; x++) {
		//			for (y = 4; y >= x; y--) {
		//				System.out.print("* ");
		//			}
		//			System.out.println();
		//		}

		/*  	OUTPUT
		 *  	*
		 *  	* *
		 *  	* * *
		 *  	* * * *
		 * */
		//		for (x = 1; x <= 4; x++) {
		//			for (y = 1; y<= x; y++) {
		//				System.out.print("* ");
		//			}
		//			System.out.println();
		//		}

		/*  	OUTPUT
		 * 
		 * * 
		 * * * 
		 * * * * 
		 * * * * *
		 */
		//		int x, y, row = 5; 
		//		//Outer loop for rows  
		//		for (x=0; x<row; x++) 
		//		{ 
		//			//inner loop for space 
		//			for (y=row-x; y>1; y--) 
		//			{ 
		//				//To print space between two stars 
		//				System.out.print(" "); 
		//			} 
		//			//inner loop for columns 
		//			for (y=0; y<=x; y++ ) 
		//			{ 
		//				//To print star 
		//				System.out.print("* "); 
		//			} 
		//			//Cursor goes to the new line after printing each line.
		//			System.out.println(); 
		//		} 

		/*  	OUTPUT
   			   1 
  			  2 3 
 			 4 5 6 
			7 8 9 10
		 */
		//		int x, y, row = 4, count=1; 
		//		//Outer loop for rows  
		//		for (x=0; x<row; x++) 
		//		{ 
		//		//inner loop for space 
		//		for (y=row-x; y>1; y--) 
		//		{ 
		//			//To print space between two stars 
		//			System.out.print(" "); 
		//		} 
		//		//inner loop for columns 
		//		for (int z=0; z<=x; z++ ) 
		//		{ 
		//			//To print star 
		//			System.out.print(count +" ");
		//			count++;
		//		} 
		//		//Cursor goes to the new line after printing each line.
		//		System.out.println(); 
		//		} 

		/*  	OUTPUT
		   10 9 8 7 
		     6 5 4
		 	  3 2
			   1
		 */
		//		int x, y, row = 4, count=10; 
		//		//Outer loop for rows  
		//		for (x=0; x<row; x++) 
		//		{ 
		//			//inner loop for space 
		//			for (y=row-x; y<4; y++) 
		//			{ 
		//				//To print space between two stars 
		//				System.out.print(" "); 
		//			} 
		//			//inner loop for columns 
		//			for (int z=4; z>x; z--) 
		//			{ 
		//				//To print star 
		//				System.out.print(count +" ");
		//				count--;
		//			} 
		//			//Cursor goes to the new line after printing each line.
		//			System.out.println(); 
		//		} 

		/*  	OUTPUT
		 *  	1
		 *  	1 2
		 *  	1 2 3
		 *  	1 2 3 4
		 * */
//		for (x = 1; x <= 4; x++) {
//			count = 1;						//count is reset to 1 everytime
//			for (y = 1; y <= x; y++) {		//difference in inner loop
//				System.out.print(count + " ");
//				count++;			//count inside inner loop
//			}
//			System.out.println();
//		}

		/*  	OUTPUT
		 *  	3
		 *  	6 9
		 *  	12 15 18
		 *  	21 24 27 30
		 * */
		for (x = 1; x <= 4; x++) {

			for (y = 1; y <= x; y++) {		//difference in inner loop
				System.out.print(count + " ");
				count = count+3;			//count inside inner loop
			}
			System.out.println();
		}

	}
}

