//By Douglas Oak

//Recursive Fibbinachi Application


public class Fib {
	
	public static void main(String[] args) {
		
		Integer FibNumber = 7;
		
		for(Integer i = 0; i < FibNumber + 1; i++) {
			
			System.out.print(Fibbinacci(i) + " ");
		}
		
		
	}
	
	public static Integer Fibbinacci(Integer number) {
		
		
		if(number == 0) {
			
			return 0;
		}
	    else if(number == 1 | number == 2) {
			
			return 1;
		}
		else {
			
			return Fibbinacci(number - 1) + Fibbinacci(number - 2);
		}
		
		
		
	}
	
}



