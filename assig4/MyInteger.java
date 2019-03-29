
public class Main{

    public static void main(String[] args){

        int integer = 10;
        int number = 11;
        
        MyInteger int1 = new MyInteger(integer);
        print("Integer = ", integer);
        print("Number = ", number);
        print("Integer Even = ", int1.isEven());
        print("Integer Odd = ", int1.isOdd());
        print("Integer Prime = ", MyInteger.isPrime(number));
        print("Number Even = ", MyInteger.isEven(number));
        print("Number Odd = ", MyInteger.isOdd(number));
        print("Number Prime = ", int1.isPrime());
        print("Equals Number = ", int1.equals(number));
        print("parse char 7 = ", int1.parseInt('7'));
        print("Parse String 70 = ", int1.parseInt("70"));

        

    }

    static void print(String idtext, double value){

        System.out.println(idtext + value);

    }

    static void print(String idtext, boolean value){

        System.out.println(idtext + value);

    }


}

//a class for determining if integer is even, odd and/or prime
class MyInteger {

    //ax^2 + bx + c
    private int value = 0;
   

    //integer constructor
    MyInteger(int integer){

            this.value = integer;
    }

    
     //determines if integer is even
    public boolean isEven(){
        return (this.value % 2 == 0);
    }
    
    //determines if integer is odd
    public boolean isOdd(){
        return (this.value % 2 != 0);
    }
    
    //determines if integer is prime
    public boolean isPrime(){
        for(int i = 2; i < this.value; i++){

            if(this.value % i == 0){
                return false;
            }
        }
        return true;
    }

    //determines if integer is even
    public static boolean isEven(int integer){
        return (integer % 2 == 0);
    }
    
    //determines if integer is odd
    public static boolean isOdd(int integer){
        return (integer % 2 != 0);
    }
    
    //determines if integer is prime
    public static boolean isPrime(int integer){
        for(int i = 2; i < integer; i++){

            if(integer % i == 0){
                return false;
            }
        }
        return true;
    
    }
    
    //returns true if equal to object value
    boolean equals(int integer){

        return (this.value == integer);

    }

    //converts character to integer
    int parseInt(char charNumber){

        return (int)number;
    }

    //converts string to integer
    int parseInt(String stringNumber){

        return Integer.parseInt(number);
    }


}   

