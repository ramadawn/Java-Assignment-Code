/*
Name: Douglas Oak

Student# : 100356690

Algorithm Description: This program prompts the user to read two integers 
and displays their sum. Your program should prompt the user to read the number 
again if the input is incorrect. 


No functions or external packages were used as part of this program

Version: 0.1.0.0

*/

import java.util.*;


class inputMismatch {
	
	public static void main(String[] args){
        
        //variables to hold two random numbers;
        double num1; 
        double num2;
        int sum;
        boolean endProgram = false;
        
        int userAnswer = 0;
        String userContinue = "y";
        //user input object
        Scanner userInput = new Scanner(System.in);
        
        //intro msg 
        System.out.println("Welcome to the math testing game");
        System.out.println("Add the numbers together to test your skills");
        
        //while loop for testing user
        while(endProgram == false){

            //load randon number
            num1 = genNum(); 
            num2 = genNum();
            
            //add numbers together
            sum = (int)num1 + (int)num2;

            //prompt user to submit answer for the sum of num1 and num2
            System.out.println("What is " + (int)num1 + " + " + (int)num2);
            //catch improper input and reapeat
            
                try{
                        
                        userAnswer = userInput.nextInt();
                        
                 } catch(InputMismatchException entry){
                         System.out.println("Sorry that is an invalid entry; Please enter a number...end program");
                         endProgram = true;
                         break;
                }
        
            
            //compare result
            if(userAnswer == sum){System.out.println("You are correct the answer is " + sum);}
            else{System.out.println("Sorry that is an invalid response. The correct answer is " + sum);}

            System.out.println("Would you like to try again?");
            System.out.println("Type <Y> or <N>");
            
            try{
                    userContinue = userInput.next();
            } catch(InputMismatchException flag){
                    System.out.println("Invalid response program ending");
                    endProgram = true;
            }

            if(userContinue.equals("n") || userContinue.equals("N")) {
                System.out.println("Goodbye");
                endProgram = true;
            }

        };

        	
			
    }
    
    static double genNum(){

        return Math.random() * 100 + 1;

    }
		
		
		
}
	
	
		
	
	
	
	
