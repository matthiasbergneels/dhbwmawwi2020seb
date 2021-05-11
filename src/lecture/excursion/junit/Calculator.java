package lecture.excursion.junit;

public class Calculator {

    public Calculator(){
        System.out.println("Calculator angelegt");
    }

    public double add(double numberA, double numberB){
        return numberA + numberB;
    }

    public double subtract(double numberA, double numberB){
        return numberA - numberB;
    }

    public double multiply(double numberA, double numberB){
        return numberA * numberB;
    }
}
