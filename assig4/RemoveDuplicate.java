
import java.util.*;

public class Main{

    public static void main(String[] args){

        print("This Program will return all number that are unique");
        print("Enter 10 integers please");  

        //size of array list
        int size = 10;
        //user int holder
        int userInput = 0;
        

        //declare array list
        ArrayList<Integer> numberList = new ArrayList<Integer>(size);
        ArrayList<Integer> uniqueNumbers = new ArrayList<Integer>(size);
        //declare scanner
        Scanner userInt = new Scanner(System.in);
        
        for(int i = 0; i<size; i++ ){

            print("Integer# ", i, " = ");
            
            userInput = userInt.nextInt();

            numberList.add(userInput);

        }
        //iterate through each number and check to see if it exist in uniqueNumbers
        for(int pos = 0; pos<size; pos++ ){
            
            if(uniqueNumbers.contains(numberList.get(pos))){
                continue;
            }
        else{uniqueNumbers.add(numberList.get(pos));}
            
        }

        //output user input numbers
        System.out.println("User Input Inegers = " + numberList.toString());
        System.out.println("Unique Inegers = " + uniqueNumbers.toString());



    }

    static void print(String text){

        System.out.println(text);
    }
    
    static void print(String idtext, double value){

        System.out.println(idtext + value);

    }

    static void print(String idtext, int value){

        System.out.println(idtext + value);

    }

    static void print(String idtext, int value, String txt){

        System.out.println(idtext + value + txt);

    }

    static void print(String idtext, boolean value){

        System.out.println(idtext + value);

    }


}


