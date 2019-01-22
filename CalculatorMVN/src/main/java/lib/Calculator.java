package lib;
/**
 * class Calculator, which use methods to calculate and use for this @params
 * @param firstNumber first number for calculation
 * @param secondNumber second number for calculations
 * @param mathOperations operation, which use to calculate my numbers
 * */
public class Calculator {

    private double result;


    void addNumbers(double firstNumber, double secondNumber){
        this.result = firstNumber + secondNumber;
    }
    void minusNumbers(double firstNumber, double secondNumber){
        this.result = firstNumber - secondNumber;
    }
    void multiplyNumbers(double firstNumber, double secondNumber){
        this.result = firstNumber * secondNumber;
    }
    void divideNumbers(double firstNumber, double secondNumber){
        this.result = firstNumber/secondNumber;
    }
    void powNumbers(double firstNumber, double secondNumber){
        this.result = Math.pow(firstNumber, secondNumber);
    }

    public void calculateNumbers(double firstNumber, MathOperations mathOperations, double secondNumber){
        switch (mathOperations){
            case ADD:
                addNumbers(firstNumber, secondNumber);
                break;
            case MINUS:
                minusNumbers(firstNumber, secondNumber);
                break;
            case MULT:
                multiplyNumbers(firstNumber, secondNumber);
                break;
            case DIVIDE:
                divideNumbers(firstNumber, secondNumber);
                break;
            case POW:
                powNumbers(firstNumber, secondNumber);
        }
    }
    public double getResult(){
        return result;
    }
    public void clearResult(){
        this.result=0;
    }
}
