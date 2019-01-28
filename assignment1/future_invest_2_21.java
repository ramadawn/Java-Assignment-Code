/*
Name: Douglas Oak

Student# : Not Available due to post in public repository

Algorithm Description: This program calculates furture investment


No functions or external packages were used as part of this program

Version: 0.1.0.0

*/


import java.util.*;

public class future_invest_2_21 {
	
	public static void main(String[] args) {
		
		//initialize variables
		double futureInvestValue; //resultant value
		double interestRate; // the interest rate
		double numberOfYears; // number of years invested
		double startingAmount; //initial investment

		//initialize scanner object
		Scanner userInput = new Scanner(System.in);
		
		//inform user of program's purpose
		System.out.println("This program will calculated total money after term of investment");
		System.out.println();
		
		//prompt user for equation values 
		System.out.println("Please enter Starting investment amount");
		startingAmount = userInput.nextDouble();
		System.out.println();
		System.out.println("Enter annual interest rate");
		interestRate = userInput.nextDouble();
		System.out.println();
		System.out.println("Enter term of investment in years");
		numberOfYears = userInput.nextDouble();
		System.out.println();
		
		//divide interest by 100
		interestRate = interestRate / 100.0;
		
		//calculate the result
		futureInvestValue = startingAmount * Math.pow((1 + interestRate), numberOfYears); 
		
		
		//return result
		System.out.println("After " + numberOfYears + " years, at " + interestRate + "% ");
		System.out.println("Your new amount will be " + futureInvestValue);
		
	
		
	}
}