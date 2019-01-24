/*
Name: Douglas Oak

Student# : Not Available due to post in public repository

Algorithm Description: This program calculates a predicted grade for info 2313
by prompting the user for their actual mark ,on their assignments and test, or their
predicted mark and returns a final predicted letter grade based on the calculated mark total.


No functions or external packages were used as part of this program

Version: 0.1.0.0

*/

import java.util.*;


class Grade_Calculator {
	
	public static void main(String[] args){
		
		//marks
		final double A_PLUS = 90;
		final double A =  85;
		final double A_MINUS = 80;
		final double B_PLUS = 76;
		final double B = 72;
		final double B_MINUS = 68;
		final double C_PLUS = 64;
		final double C = 60;
		final double C_MINUS = 56;
		final double D = 50;
		String grade = "";
		
		//number of entries
		int numberOfLabs = 10;
		int numberOfAssignments = 4;
		int numberOfQuiz = 2;
		
		//ranges
		double labOutOf = 2;
		double AssignmentOutOf = 60;
		
		//percentages
		double singleLabPercent = 1;
		double singleAssignmentPercent = 2.5;
		
		//storage variables
		double currentLab;
		double currentAssig;
		double currentQuiz;
		double finalPercentage = 0;
		double totalLab = 0;
		double totalAssig = 0;
		double totalQuiz =0;
		
		//initialized array for labs
		double[] labs = new double[numberOfLabs];
		//assignments
		double[] assig = new double[numberOfAssignments];
		//quizes
		double[] quiz = new double[numberOfQuiz];
		//midterm
		double examMidterm = 0;
		//final
		double examFinal = 0;
		//entry loop control variable
		boolean dataCorrect = false;
		//entry Type control variables
		String entryType;
		
		//input object
		Scanner userInput = new Scanner(System.in);
		
		//fill arrays with zeros
		for (double cell: labs){
			cell = 0;
		}
		
		for (double cell: assig){
			cell = 0;
		}
		
		for (double cell: quiz){
			cell = 0;
		}
		
		//prompt user for grade entries
		System.out.println("Welcom to the Info 2313 Grade Predictor Program");
		System.out.println();
		System.out.println("Press <A> to use an average mark for labs, quizzes and assignments");
		System.out.println("Press <I> to enter individual values for these items");
		
		while(dataCorrect == false){
			
			entryType = userInput.next();
			
			//test entry type
			if (entryType.equals("A") || entryType.equals("a")){
					
					entryType = "Average";
					
					}
			
			else if (entryType.equals("I") || entryType.equals("i")){
				
					entryType = "Individual";
				
			}
			
			else {
				
				System.out.println("INPUT ERROR; type A for average or I for individual");
				continue;
				
			}
			
			//if the user wants to use averages
			
			if (entryType.equals("Average")){
				//lab marks
				System.out.println("Enter Average Lab Mark /2");
				currentLab = userInput.nextDouble();
				//assignment marks
				System.out.println("Enter Average Assignment Mark /60");
				currentAssig = userInput.nextDouble();
				//quiz marks
				System.out.println("Enter Average Quiz Mark /10");
				currentQuiz = userInput.nextDouble();
				//midterm
				System.out.println("Enter Midterm Mark /20");
				examMidterm = userInput.nextDouble();
				//final
				System.out.println("Enter Final Mark /40");
				examFinal = userInput.nextDouble();
				
				finalPercentage = (currentLab/labOutOf) * numberOfLabs * singleLabPercent + 
									(currentAssig/AssignmentOutOf) * numberOfAssignments * singleAssignmentPercent + 
									currentQuiz * numberOfQuiz + examMidterm + examFinal;
									
				
				
				
			}
			
			//if the user wants to enter individual values
			
			else if (entryType.equals("Individual")){
				
				int counter = 0;
				
				for (double cell: labs){
					
					counter++; //tracks current lab number
					System.out.println("Enter Score for Lab /2 " + counter);
					//take in current lab value
					currentLab = userInput.nextDouble();
					//calculate modified lab value
					currentLab = (currentLab/labOutOf) * singleLabPercent;
					cell = currentLab;
					//DOES JAVA NOT HAVE ANY BUILT IN METHODS THAT DO THIS ?!?
					totalLab += cell;
				}
		
				counter = 0;
				for (double cell: assig){
					
					counter++; //tracks current assignment number
					System.out.println("Enter Score for Assignment /60 " + counter);
					//take in current Assignment value
					currentAssig = userInput.nextDouble();
					currentAssig = (currentAssig/AssignmentOutOf) * singleAssignmentPercent;
					cell = currentAssig;
					totalAssig += cell;
					
				}
		
				counter = 0;
				for (double cell: quiz){
					
					counter++; //tracks current quiz number
					System.out.println("Enter Score for Quiz /10 " + counter);
					//take in current quiz value
					currentQuiz = userInput.nextDouble();
					cell = currentQuiz;
					totalQuiz += cell;
				}
				
				System.out.println("Enter Midterm Mark /20");
				examMidterm = userInput.nextDouble();
				//final
				System.out.println("Enter Final Mark /40");
				examFinal = userInput.nextDouble();
				
				finalPercentage = totalLab + totalAssig + totalQuiz + examMidterm + examFinal;
				
			}
			else {System.out.println("ENTRY TYPE ERROR");}
				
			//determine letter grade

			if (finalPercentage >= A_PLUS) {grade = "A+";}
			else if (finalPercentage >= A) {grade = "A";}
			else if (finalPercentage >= A_MINUS) {grade = "A-";}
			else if (finalPercentage >= B_PLUS) {grade = "B+";}
			else if (finalPercentage >= B) {grade = "B";}
			else if (finalPercentage >= B_MINUS) {grade = "B-";}
			else if (finalPercentage >= C_PLUS) {grade = "C+";}
			else if (finalPercentage >= C) {grade = "C";}
			else if (finalPercentage >= C_MINUS) {grade = "C-";}
			else if (finalPercentage >= D) {grade = "D";}
			else if (finalPercentage < D) {grade = "F";}
			else {System.out.println("LETTER GRADE ERROR");}
			
			//output final letter grade
			System.out.println();
			System.out.println("Your Final Grade Percentage is " + (int)finalPercentage);
			System.out.println("Letter Grade earned is " + grade);
			
			
			//prompt user to continue
			System.out.println();
			System.out.println("Press <A> to use an average mark for labs, quizzes and assignments");
			System.out.println("Press <I> to enter individual values for these items");
			System.out.println("Press <E> to exit program");
			entryType = userInput.next();
			
			//test to end program
			if (entryType.equals("E") || entryType.equals("e"))
			{dataCorrect = true;}

			
			}
				
			
		}
		
		
		
	}
	
	
		
	
	
	
	
