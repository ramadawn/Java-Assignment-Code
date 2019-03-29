
public class Main{

    public static void main(String[] args){

        double a = -1;
        double b = 2;
        double c = 4;
        
        QuadraticEquation equ1 = new QuadraticEquation(a, b, c);
        print("A = ", equ1.getA());
        print("B = ", equ1.getB());
        print("C = ", equ1.getC());
        print("Discriminant = ", equ1.getDiscriminant());
        print("Root 1 = ", equ1.getRoot1());
        print("Root 2 = ", equ1.getRoot2());

        

    }

    static void print(String idtext, double value){

        System.out.println(idtext + value);

    }


}

//a class for calculating quadratic roots
class QuadraticEquation {

    //ax^2 + bx + c
    private double a = 0;
    private double b = 0;
    private double c = 0;

    //quadratic equation object constructor
    QuadraticEquation(double A, double B, double C){

            this.a = A;
            this.b = B;
            this.c = C;
        
    }

    //get a from ac^2
    public double getA(){
        return this.a;
    }
    //get b from bx
    public double getB(){
        return this.b;
    }
    //get the constant
    public double getC(){
        return this.c;
    }

    //returns b^2 - 4ac
    public double getDiscriminant(){

        return Math.pow(this.b, 2) - (4 * this.a * this.c);

    }

    public double getRoot1(){
        //if the discrimnant is less than zero the quadratic has no roots
        if(this.getDiscriminant() < 0){
            return 0;
        }
        else{
            return (-this.b + Math.sqrt(this.getDiscriminant())) / (2 * this.a);  
        }

    }

    public double getRoot2(){
        //if the discrimnant is less than zero the quadratic has no roots
        if(this.getDiscriminant() < 0){
            return 0;
        }
        else{
           
            return (-this.b - Math.sqrt(this.getDiscriminant())) / (2 * this.a); 
        }

    }

};