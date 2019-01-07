/*
Name: Douglas Oak

Student# :not listed for security as this is a public repository

Algorithm Description: This program uses a for loop to calculate ever increasingly 
accurate estimations of Pi. This can be done by changing the value of the "num_calculations"
variable. This variable controls how many fractions the initial starting value of 4 is 
multiplied against

No functions or external packages were used as part of this program

Version: 0.1.0.0

*/




public class Pi_calculator {
	
	//initial variables:
	
	//depth of Pi calculation
	static int num_calculations = 7;
	//starting fraction values
	static double starting_denominator = 1.0;
	static double starting_numerator = 1.0;
	//initial Pi value
	static double intial_Pi_value = 4.0;
	//overall calculation storage container
	static double current_value = 0;
	//container for holding the divisor of the denomination and the numerator 
	static double num_denom_devisor;
	
	public static void main(String[] args) 
	{
		
		//loop for generating fractions and calculating initial Pi value modifier
		for(int i=0; i <= num_calculations; i++ ) {
			
			//convert fraction to decimal
			num_denom_devisor = starting_numerator / starting_denominator;
			
			
			//if zero set current value to zero
			if(i==0) {
				
				current_value = 1;
				
			}
			
			
			//if even add fraction to current value
			else if(i % 2 == 0) {
				
				current_value = current_value + num_denom_devisor;
				
			}
			
			//if odd subtract from current value
			else if(i % 2 != 0) {
				
				current_value = current_value - num_denom_devisor;
				
			}
			
			//if above criterion is not met, an error had occurred
			else {
				
				System.out.println("Fraction Addition Error");
				
			}
			
			//after each calculation loop increase denominator
			starting_denominator += 2;
			
			
		}
		
		//multiply calculated fractional modifier by initial Pi value to calculate Pi estimate
		current_value = current_value * intial_Pi_value;
		
		//print estimate
		System.out.println("Calculated Value of Pi: ");
		System.out.println(current_value);
		
	}
}
