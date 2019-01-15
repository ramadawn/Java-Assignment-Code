/*
Name: Douglas Oak

Student# : Not Available due to post in public repository

Algorithm Description: The purpose of this program is to tempertaure, wind speed and relative humidity 
data from the user and use those factors to calculate wind chill temperature. The program uses a while
loop to keep the program running and check for imporper entries. 

No functions or external packages were used as part of this program

Version: 0.1.0.0

*/

import java.util.*;

public class lab2_Wind_Chill {
	
	
	
	
	public static void main(String[] args){
		
		final double MIN_OUTSIDE_TEMP = -58.0;
		final double MAX_OUTSIDE_TEMP = 41.0;
		final double MIN_WIND_SPEED = 2.0;
	
		//initialize variables
		double outsideTemp; //outside temperature in fahrenhiet; range = -58 - 41
		double windSpeed; //wind speed in miles per hour; min = 2 mph
		double relativeHumidity; //Outside relative humidity 
		double windChillTemp; //Wind Chill Temperature; output variable
		String continueProgramInput; //holds user continue program input;
		boolean ContinueProgram = true;
		
		
		
		//initialize user input object
		Scanner userInput = new Scanner(System.in);
	
		//introduction banner
			System.out.println();
			System.out.println("Welcome to the windchill calculator");
		
		//progrma loop
		while (ContinueProgram == true){
		
			//Promp user fot Out side tempersture
			System.out.println();
			System.out.println("Please enter outside temperature in fahrenheit (-58 - 41) : ");
			outsideTemp = userInput.nextDouble();
		
			//test to ensure temp falls inside allowed range
			if (outsideTemp < MIN_OUTSIDE_TEMP || outsideTemp > MAX_OUTSIDE_TEMP){
			
				System.out.println();
				System.out.println("ERROR Entered temperature falls outside allowed range");
				System.out.println();
				continue;
			
			}
	
		
			//Prompt user for Windspeed
			System.out.println("Please enter Windspeed of 2mph or more :");
			windSpeed = userInput.nextDouble();
			
			//test to windspeed greater than or equal to 2
			if (windSpeed <= MIN_WIND_SPEED ){
			
				System.out.println();
				System.out.println("ERROR Entered windspeed must be greater than 2 mph");
				System.out.println();
				continue;
			
			}
			
		
			//Prompt for Relative Temperature
			System.out.println("Please enter relative humidity");
			relativeHumidity = userInput.nextDouble();
			
			//calculation of wind chill
			windChillTemp = 35.74 + (0.6214 * outsideTemp) - (35.75 * Math.pow(windSpeed,0.16)) + (0.4275 * outsideTemp * Math.pow(windSpeed , 0.16));
			
			//out put answer
			System.out.println();
			System.out.println("Calculated wind chill is " + windChillTemp + " degress fahrenheit");
			
			//prompt to continue
			System.out.println();
			System.out.println("Would you like to continue? Type Y and enter if yes else type N and press enter");
			continueProgramInput = userInput.next();
			System.out.println();
			
			System.out.println("User Input = " + continueProgramInput);
			
			//test to see if program need(s to continue
			if (continueProgramInput.equals("Y") || continueProgramInput.equals("y")) {
				
				continue;
				
			}
				
			else {	
				
				ContinueProgram = false;
				System.out.println();
				System.out.println("Good Bye");
				
			}
			
			
		}
		
	}
		
}
	
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
