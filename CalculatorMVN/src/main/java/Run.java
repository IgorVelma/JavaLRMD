import lib.*;

import java.io.IOException;

/**
 * Class runner, have main point.
 * And some functions for user
 * */
public class Run {
    /**
     * Class Calculator
     * */
    private Calculator calc;

    /**
     * Massive of arguments
     * */
    private double arguments[] = new double [2];

    /**
     * Mathematical operation
     * */
    private MathOperations operation;

    private boolean isFirstTime = true;

    /**
     * Constructor
     * @param calc
     * */
    public Run (Calculator calc){
        this.calc = calc;
    }

    private boolean isUseRes(){
        boolean isUse = false;
        if(this.isFirstTime){
            this.isFirstTime = false;
        }else{
            isUse = ConsoleWriter.isUsePrevRes();
        }
        return isUse;
    }

    private void setArgumentsAndOperation(){
        if(isUseRes()){
            this.arguments[0] = this.calc.getResult();
            ConsoleWriter.Write("first: "+this.calc.getResult());
            this.operation = ConsoleWriter.askOperation();
        }else{
            this.arguments[0] = ConsoleWriter.askCorrectNumber("first");
            this.operation = ConsoleWriter.askOperation();
        }
        this.arguments[1] = ConsoleWriter.askCorrectNumber("second");
    }

    private void calcAndCatchException(){
        try{
            calc.calculateNumbers(this.arguments[0], this.operation, this.arguments[1]);
        }catch (ArithmeticException e){
            ConsoleWriter.showException(e.getMessage());
            calc.clearResult();
        }
    }

    public void calculateIfNotExit(){
        boolean exit = false;
        while (!exit){
            this.setArgumentsAndOperation();
            this.calcAndCatchException();
            ConsoleWriter.showResult(calc);
            exit = ConsoleWriter.isExit();

        }
    }

    public static void main(String[] args)  {
        Run run = new Run(new Calculator());
        run.calculateIfNotExit();


    }
}
