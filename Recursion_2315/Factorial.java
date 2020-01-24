//By Douglas Oak

//Recursive Factorial Application


public class Factorial {
	
	public static void main(String[] args) {
		
		System.out.println(Fact(10));
		
		
	}
	
	public static Integer Fact(Integer number) {
		
		
		if(number == 1) {
			return 1;
		}
		
		else {
			return Fact(number - 1) * number;
		}
		
	}
	
}



