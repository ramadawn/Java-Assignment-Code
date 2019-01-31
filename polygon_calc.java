/*
Name: Douglas Oak

Student# : Not Available due to post in public repository
Algorithm Description: This program prompts the user to enter 
the number of sides and their length of a regular polygon and displays its area. 

No functions or external packages were used as part of this program

Version: 0.1.0.0

*/

import java.util.*;


public class polygon_calc {
	
	
	
	
	public static void main(String[] args){
		
		//initializing variables
		int numSides; //number of polygon sides
		double sideLength; //length og each side
		boolean endProgram = false; //control flag for progrsm termination
		String userEndInput;
		double polygonArea;
		
		//initialize user entry object
		Scanner userInput = new Scanner(System.in);
		
		//Intro text
		System.out.println();
		System.out.println("This program will calculate for you the area of a polygon given it's area and number of sides");
		System.out.println();
		
		while(endProgram == false) {
			
			//prompt for number of polygon sides
			System.out.println("Please enter the number of sides of your polygon");
			numSides = userInput.nextInt();
			System.out.println();
			
			//prompt length of each side;
			System.out.println("Please enter the length of each side");
			sideLength = userInput.nextDouble();
			System.out.println();
			
			//calculate the area of the polygon
			polygonArea = (numSides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI/numSides));
			
			//return answer to user
			System.out.println("The area of the polygon is " + polygonArea);
			
			
			//prompt to contine program or not
			System.out.println();
			System.out.println("Would you to calculate another polygon?");
			System.out.println("Press <Y> for Yes, <E> to end");
			userEndInput = userInput.next();
			
			//test for program end
			if (userEndInput.equals("E") || userEndInput.equals("e")){
				
				endProgram = true;
				System.out.println("Goodbye"); 

			}
			
		}
		
	}
}
	
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
