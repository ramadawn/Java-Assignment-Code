//By Douglas Oak 2020-02-1
//This method checks to ensure that left brackets are independently closed off by right brackets


import java.util.*;


public class Assignment2 {
	
	public static void main(String[] args) {
		String testString = "[2+(a-b)*(c+b)]";
		String testString2 = "]2+)a-b(*)c+b([";
		String testString3 = "[2+(a-b)*(c+b";
		String testString4 = "(2+(a-b)*(c+b)]";
		String testString5 = "[1+e][9+4]";
		String testString6 = "(1+e)(9+4)";
		
		
		System.out.println(testString + " = " + bracketsMatch(testString));
		System.out.println(testString2 + " = " + bracketsMatch(testString2));
		System.out.println(testString3 + " = " + bracketsMatch(testString3));
		System.out.println(testString4 + " = " + bracketsMatch(testString4));
		System.out.println(testString5 + " = " + bracketsMatch(testString5));
		System.out.println(testString6 + " = " + bracketsMatch(testString6));
	}
	
	
	//this class checks if curved and square brackets are independently matched.
	//if also checks for backwards pairs such as "]["
	//returns true if matched, false if not
	public static boolean bracketsMatch(String equation) {
		
		//stacks for stored curved and square brackets
		Stack<String> curvedBracketStack = new Stack<>();
		Stack<String> squareBracketStack = new Stack<>();
		
		//flag indicating that curved brackets match
		boolean curvedBracketsMatch = false;
		//flag indicating that curved brackets match
		boolean squareBracketsMatch = false;
		
		//count of brackets: positive value means too many left brackets
		// negative value means too many right brackets
		int curvedCount = 0; // +1 for "(", -1 for ")"
		int squaredCount = 0; // +1 for "(", -1 for ")"
		
		//split input string into a character array
		String[] charArray = equation.split("");
		
		//iterate through character array
		for(String pos : charArray) {
			
			//if curved bracket found, load into curved bracket array
			if(pos.contentEquals("(") || pos.contentEquals(")")) {
				curvedBracketStack.push(pos);
				
			}
			
			//if square bracket found, load into square bracket array
			else if(pos.contentEquals("[") || pos.contentEquals("]")) {
				squareBracketStack.push(pos);
			}
			else {}
		}
		
		int curvedSize = curvedBracketStack.size();
		int squaredSize = squareBracketStack.size();
		
		
		//iterate through curved bracket array
		for (int i = 0; i < curvedSize; i++) {
			
			//pop off the last element
			String bracket = curvedBracketStack.pop();
			
			//if it is a left bracket lower count
			if(bracket.contentEquals(")")) {
				curvedCount -= 1;
			}
			//otherwise raise count
			else {curvedCount += 1;}
			
			//if count ever goes positive brackets are not matched
			if(curvedCount > 0) {
				return false;
			}
		}
		
		//iterate through square bracket array
		for (int i = 0; i < squaredSize; i++) {
			//pop off the last element
			String bracket = squareBracketStack.pop();
			
			//if it is a left bracket lower count
			if(bracket.contentEquals("]")) {
				squaredCount -= 1;
			}
			//else raise count
			else {squaredCount += 1;}
			
			//if count ever goes positive brackets are not matched
			if(squaredCount > 0) {
				return false;
			}
		}
		
		//logical tests:
		
		//by this stage, the brackets are only equal if the count is zero
		if(curvedCount == 0) {curvedBracketsMatch = true;}
		if(squaredCount == 0) {squareBracketsMatch = true;}
		
		//if both curved and squared brackets are matched return true
		if(curvedBracketsMatch && squareBracketsMatch) {
			return true;
		}
		
		//otherwise return false
		else {return false;}
	
	}
}
