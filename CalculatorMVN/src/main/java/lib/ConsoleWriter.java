package lib;

import java.util.Scanner;

/**
 * Class for interact with user
 * */
public class ConsoleWriter {

    private static Scanner scan = new Scanner(System.in);

    /**
     * Output info
     * @param message
     * */
    public static void Write(String message) {
        System.out.println(message);
    }

    /**
     * Return user info
     * */
    public static String Read(){
        return scan.next();
    }

    /**
     * Get mathematical operation from console
     * @return MathOperations operation
     * */
    public static MathOperations askOperation(){
        MathOperations operation = null;
        boolean isCorrect = false;
        while(!isCorrect){
            ConsoleWriter.Write("Input operation + - * / ^");
            String symbol = ConsoleWriter.Read();
            try{
                operation = MathOperations.getOperation(symbol.charAt(0));
                isCorrect = symbol.length() == 1;
            }catch (UnsupportedOperationException e){
                ConsoleWriter.Write("Incorrect operation!");
            }
        }
        return operation;
    }

    /**
     * @return boolean isUse=true, if user type y
     * */
    public static boolean isUsePrevRes(){
        boolean isUse = false;
        ConsoleWriter.Write("Use previous result? (Y/N): ");
        String answer = ConsoleWriter.Read();
        ConsoleWriter.Write("");
        if(answer.toLowerCase().equals("y")) {
            isUse = true;
        }
        return isUse;
    }

    /**
     * Like method Read() with message
     * @return user input
     * */
    private static String askArgument(String message){
        ConsoleWriter.Write(message);
        return ConsoleWriter.Read();
    }

    /**
     * @return argument type of double if user correct input it
     * */
    public static double askCorrectNumber(String argumentNumber){
        double argument = 0;
        boolean isCorrect = false;
        while (!isCorrect){
            try{
                String message = String.format("Input %s number: ", argumentNumber);
                argument = Double.parseDouble(ConsoleWriter.askArgument(message));
                isCorrect = true;
            }catch (NumberFormatException ex){
                ConsoleWriter.Write(String.format("Please input correct %s number", argumentNumber));
            }
        }
        return argument;
    }
    /**
     * write in console result
     * */
    public static void showResult(Calculator calc){
        ConsoleWriter.Write("Result: " + calc.getResult()+"\n");
    }

    /**
     * Show exceptions in console
     * */
    public static void showException(String exceptionMessage){
        ConsoleWriter.Write("!!Problems with calculation!!");
        ConsoleWriter.Write(exceptionMessage);
        ConsoleWriter.Write("Result cleared");
    }


    /**
     * Ask about exit
     * @return exit = true if a user type yes or y
     * */
    public static boolean isExit(){
        boolean exit = false;
        ConsoleWriter.Write("You want exit? (Y/N): ");
        String exitString = ConsoleWriter.Read();
        ConsoleWriter.Write("");
        if(exitString.toLowerCase().equals("yes") ||exitString.toLowerCase().equals("y")){
            exit = true;
        }
        return exit;
    }
}
