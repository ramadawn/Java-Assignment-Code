/*
Name: Douglas Oak

Student# : Not Available due to post in public repository

Algorithm Description: solving and x and y equation

Version: 0.1.0.0

*/

public class assig_1_113 {
	
	
	public static void main (String[] args){
			//initilize variable
			double x;
			double y;
			double first_x_multiplyer = 3.4;
			double second_x_multiplyer = 2.1;
			double first_y_multiplyer = 50.2;
			double second_y_multiplyer = .55;
			double first_result = 44.5;
			double second_result = 5.9;
			
			//calculation using cramer's rule
			x = ((first_result * second_y_multiplyer) - (first_y_multiplyer * second_result)) 
				/ ((first_x_multiplyer * second_y_multiplyer) - (first_y_multiplyer * second_x_multiplyer));
				
			y = ((first_x_multiplyer * second_result) - (first_result * second_x_multiplyer))
			    / ((first_x_multiplyer * first_y_multiplyer) - (first_y_multiplyer * second_x_multiplyer));
				
			//print out result
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			

	}
}