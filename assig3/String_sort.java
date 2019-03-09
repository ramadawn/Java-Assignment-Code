/*

Apologies my textbook doesn't have 7.37 so I wrote a program that takes in a string and sorts it by character

Name: Douglas Oak

Student# : Not Available due to post in public repository

Algorithm Description: This program takes in a string. Converts it into a character array and then sorts the letters and returns the 
letters in sorted order

It then returns the sorted numbers to the user.


No functions or external packages were used as part of this program

Version: 0.1.0.0

*/

import java.util.*;

public class String_sort {
	
	public static void main(String[] args){
	
		//initialize vsriables
		int arrayLength = 0;
		String stringToBeSorted;
		boolean sorted = false;
		char placeHolder;
		int position = 0;
		
		
		
		//initialize user input object
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter String to be sorted");
		
		//take in input string
		stringToBeSorted = userInput.next();
		
		//get string length
		arrayLength = stringToBeSorted.length();
		
		
		//initialize a letter array
		char[] letterArray = new char[arrayLength];
		
		
		for(char letter : stringToBeSorted.toCharArray()){
		
			letterArray[position] = letter;
			position++;
		
		}
		
		
		
		//sort array
		Arrays.sort(letterArray);
		
		
		System.out.println("Sorted List: ");
		//output sorted list
		for (char letter : letterArray){
		
			System.out.print(letter + " ");
		
		}
		
	}
}