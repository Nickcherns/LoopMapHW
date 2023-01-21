import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LoopMap {

	public static void main(String[] args) {
		/* 1. Write a program that does the following:
				- Asks the user for 5 numbers
				- Stores them in an array list
				- Finds the sum, product, largest, and smallest of those numbers
		 */

	
		//variable for user input
		Scanner input = new Scanner(System.in);
		
		//variables to store input values
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		
		//gather user inputs
		System.out.println("Enter one number...");
		String numInput1 = input.nextLine();
		num1 = Integer.parseInt(numInput1);
		
		System.out.println("Enter one number...");
		String numInput2 = input.nextLine();
		num2 = Integer.parseInt(numInput2);
		
		System.out.println("Enter one number...");
		String numInput3 = input.nextLine();
		num3 = Integer.parseInt(numInput3);
		
		System.out.println("Enter one number...");
		String numInput4 = input.nextLine();
		num4 = Integer.parseInt(numInput4);
		
		System.out.println("Enter one number...");
		String numInput5 = input.nextLine();
		num5 = Integer.parseInt(numInput5);
		
		
		// Array List to store the inputs
		List<Integer> numbList = new ArrayList<>();
		// store the user's values into arrayList
		numbList = new ArrayList<>(Arrays.asList(new Integer[] {num1, num2, num3, num4, num5}));
		//print list for reference
		System.out.println(numbList);
		
		
		// find the sum of numbers in the List
		int sum = 0;
		for(int i=0; i < numbList.size(); ++i) {
			sum = sum + numbList.get(i);
		}
		System.out.println(sum);
		
		
		// find the product of numbers in the List
		int product = 1;
		for(int i=0; i < numbList.size(); ++i) {
			product = product * numbList.get(i);
		}
		System.out.println(product);
		
		
		// find the largest number of the List
		int largestNum = 0;
		for(int i=0; i < numbList.size(); ++i) {
			if (numbList.get(i) > largestNum) {
				largestNum = numbList.get(i);
			}
			else {
				largestNum = largestNum;
			}
		}
		System.out.println(largestNum);
		
		
		// find the smallest number of the List
		int smallestNum = largestNum;
		for(int i=0; i < numbList.size(); ++i) {
			if (numbList.get(i) < smallestNum) {
				smallestNum = numbList.get(i);
			}
			else {
				smallestNum = smallestNum;
			}
		}
		System.out.println(smallestNum);
		
	
		
		
		//Teacher solution
		/*
		Scanner input = new Scanner(System.in);
		// use double in case of fractions
		List<Double> numbers = new ArrayList<>();
		
		for(int i=0; i<5; ++i) {
			System.out.println("Enter a number...");
			numbers.add(Double.parseDouble(input.nextLine()));
		}
		
		System.out.println(numbers);
		
		double sum = 0.0;
		double product = 1;
		for(int i=0; i<numbers.size(); ++i) {
			sum += numbers.get(i);
			product *= numbers.get(i);
		}
		System.out.printf("Sum: %f Product: %f\n", sum, product);
		
		// Possible answer #1
		Collections.sort(numbers);
		System.out.printf("Largest: %f Smallest: %f\n", numbers.get(numbers.size()-1), numbers.get(0));
		
		//Possible answer #2
		double smallest = 999999999.9;
		double largest = -9999999999.9;
		
		for(int i=0; i<numbers.size(); ++i) {
			double current = numbers.get(i);
			sum += current;
			product *= current;
			
			if(current < smallest) {
				smallest = current;
			}
			if(current > largest ) {
				largest = current;
			}
		}
		System.out.printf("Largest: %f Smallest: %f\n", largest, smallest);
		
		//possible answer #3
		double first = numbers.get(0);
		double smallest1 = first;
		double largest1 = first;
		
		double sum1 = first;
		double product1 = first;
		
		for(int i=0; i<numbers.size(); ++i) {
			double current = numbers.get(i);
			sum1 += current;
			product1 *= current;
			
			if(current < smallest1) {
				smallest1 = current;
			}
			if(current > largest1) {
				largest1 = current;
			}
		}
		System.out.printf("Largest: %f Smallest: %f\n", largest, smallest);
		
		
		// possible answer #4
		double smallest2 = first;
		double largest2 = first;
		
		double sum2 = first;
		double product2= first;
		
		for(int i=0; i<numbers.size(); ++i) {
			double current = numbers.get(i);
			sum2 += current;
			product2 *= current;
			smallest2 = Math.min(smallest2, current);
			largest2 = Math.max(largest2, current);
		}
		System.out.printf("Sum: %f Product: %f\n", sum, product);
		System.out.printf("Largest: %f Smallest: %f\n", largest, smallest);
		*/
		
	}

}
