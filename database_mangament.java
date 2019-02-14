/*
Name: Douglas Oak

Student# : Not Available due to post in public repository

Algorithm Description: This program prompts the user for employee information
loads the information into a employee object and then stores that object in an array.

It then iterates through the array and returns SQL query strings that add the employee to a database


No functions or external packages were used as part of this program

Version: 0.1.0.1

*/



import java.util.*;


//create a queuy assignment program
public class Quey_Tracker {
	
	
	public static void main(String[] args){
		
			//initialize scanner object
			Scanner userInput = new Scanner(System.in);
			//progrm control flag
			boolean end_program = false;
			//Array length
			int numEmployees = 1;
			String outPutString;
			
			
			
		
			//intro msg
			print("Welcome to the New Employees database entry app");
			
			//prompt for number of records
			System.out.print("How many records do you need to create: ");
			numEmployees = userInput.nextInt();
			
			//object pointer array
			employees[] employee_array = new employees[numEmployees];
			
			for(int employee = 0; employee < numEmployees; employee++){
				
				//creates new customer
				employees person =  new employees();   
				
			System.out.println("Record for new employee " + (employee + 1));
				newLine();
				
				
				//prompt for first name
				print("Enter Employee first name");
				person.firstName = userInput.next();
				
				//prompt for last name=
				print("Enter Last Name");
				person.lastName =  userInput.next();
				newLine();
				
				//prompt for salary
				print("Enter salary");
				person.salary = userInput.nextDouble();
				newLine();
				
				//prompt for position
				print("Enter position");
				person.position = userInput.next();
				newLine();
				
				
				
				employee_array[employee] = person;
				
			}
			
			newLine();
			
			//iterate through employees and output SQL query strings
			for( employees member : employee_array){
			
			
			outPutString = "INSERT INTO employees(first_name,last_name,salary,position)\nVALUES\n('" + member.firstName + "','" + member.lastName + "'," + member.salary + ",'" + member.position + "');";
			print(outPutString);				 
			newLine();
			}
			
			
			
			//person.idNumber = 1;
			//person.name = "Frank";
			//person.problem_time = 15;
			
	}
	
	
	//print functions to aid with coding and debugging Dtypes int, double and String
	
	public static void print(int input){
		
		System.out.println(input);
		
		
	}
	
	public static void print(double input){
		
		System.out.println(input);
		
		
	}
	
	public static void print(String input){
		
		System.out.println(input);
		
		
	}
	
	public static void newLine(){
	
		System.out.println();
	
	}
	
}
//customer object

class employees {
	
	String firstName;		  //first name
	String lastName ;  //Last Name
	double salary;
	String position;
	
}