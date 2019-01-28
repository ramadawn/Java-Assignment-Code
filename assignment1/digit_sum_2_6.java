/*
Name: Douglas Oak

Student# : Not Available due to post in public repository

Algorithm Description: This program will sum the value of the digits of a number that a user enters


No functions or external packages were used as part of this program

Version: 0.1.0.0

*/


import java.util.*;

public class digit_sum_2_6 {
	
	public static void main(String[] args) {
		
		//initialize variables
		String numberString; //takes in user input as string
		int stringLength; //holds string length
		char stringholder; //Holds the current string digit
		int currentSum = 0; //holds the running sum
		int currentInt = 0;

		//initialize scanner object
		Scanner userInput = new Scanner(System.in);
		
		
		
		//inform user of program's purpose
		System.out.println("This program takes in a number and return a sum it's digits");
		System.out.println();
		System.out.println("Please enter a number");
		
		//take in user input as string
		numberString = userInput.next();
		
		//calcullate he length of sting
		stringLength = numberString.length();
		
		//iterate through string characters and sum
		for (int i = 0; i < stringLength; i++){
			
			//select character at position i
			stringholder = numberString.charAt(i);
			//concervt character to integer
			currentInt = Character.getNumericValue(stringholder);
			//add integer to current sum
			currentSum += currentInt;
			
			
		}
		
		
		//return result
		System.out.println("The sum is " + currentSum);
		
	
		
	}
}