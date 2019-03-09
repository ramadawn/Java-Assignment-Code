/*

Name: Douglas Oak

Student# : Not Available due to post in public repository

Algorithm Description: This program takes in a variable set of numbers and bubble sorts them using an array.

It then returns the sorted numbers to the user.


No functions or external packages were used as part of this program

Version: 0.1.0.0

*/

import java.util.*;

public class Bubble_sort {
	
	public static void main(String[] args){
	
		//initialize vsriables
		int numNumbersToSort = 1;
		boolean sorted = false;
		int placeHolder = 0;
		
		
		
		//initialize user input object
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("How many numbers would you like to sort?");
		//input number of number to sort
		numNumbersToSort = userInput.nextInt();
		
		//initialize a number array
		int[] numberArray = new int[numNumbersToSort];
		
		//load array
		for (int i = 0; i < numNumbersToSort; i++){ 
		
			System.out.print("number " + (i + 1) + " : ");
			numberArray[i] = userInput.nextInt();
			System.out.println();
		}
		
		//conitube while arrat remains unsorted
		while(sorted == false){
			
			sorted = true;
			//go through array
			for (int i = 0; i < (numNumbersToSort - 1); i++){
				
				//if i > i + 1 swap numbers

				if (numberArray[i] > numberArray[i+1]){
					
						sorted = false;
						placeHolder = numberArray[i+1];
						numberArray[i+1] = numberArray[i];
						numberArray[i] = placeHolder;
					
				}
		
			}
		}
		
		System.out.println("Sorted List: ");
		//output sorted list
		for (int number : numberArray){
		
			System.out.print(number + " ");
		
		}
		
	}
}