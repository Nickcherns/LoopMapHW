
public class ArraysHW {

	public static void main(String[] args) {
			/*  1. Write a program to sum all the values of a given Array in Java.
				2. What is the output?
			          double[ ] exampleArray = {1,5,6,5,4,1};
			          double maximum = examplesArray[0];
			          int index = 0;
	
			          for (int i = 1; i<exampleArray.length>; i++){
			               if (exampleArray[ i ] > maximum) {			               
			                    maximum = exampleArray[ i ];
			                    index = i;
			               }
			          }
			          System.out.println(index);

				3. Write a public static method called "toPower" that takes in as parameters two integers called size and power. 
					The method should return an array of size "size" with each array index raised to the value of "power." 
					So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," the method should return
					the following result: [0,1,4,9].
		
			 */
		
		//Question #1: Write a program to sum all the values of a given Array in Java.
		double[] numArray = {3.3, 5.2, 6.5, 8.2, 9.8, 1.1};
		
		double sum = 0.0;
		for(int i=0; i<numArray.length; ++i) {
			sum += numArray[i];
		}
		System.out.println(sum);
		
		//Question #2: What is the output?
		
		// Answer: 2

		
		
		
		//Question #3: Write a public static method called "toPower" that takes in as parameters two integers called size and power. 
		//			 	The method should return an array of size "size" with each array index raised to the value of "power." 
		//				So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," the method should return
		//				the following result: [0,1,4,9].
		
		// The first thing it asks you to do is create
		// a public static method called 'toPower'
		int[] result = toPower(4 , 2);
		for(int i=0; i<result.length; ++i) {
			System.out.println(result[i]);
		}
		
	}
	
	public static int[] toPower(int size, int power) {
		int[] returnArray = new int[size];
		//they want each array index in returnArray raise to the value of power
		for(int i=0; i<returnArray.length; ++i) {
			returnArray[i] = (int)Math.pow(i, power);
		}
		return returnArray;
	}

}
