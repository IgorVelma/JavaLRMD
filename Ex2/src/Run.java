
import java.util.Scanner;

public class Run {
     boolean useRes;
     double res;


    public void switcher(Calculator calc, String _f, String _s, int operation, double res) {
        this.res = res;
        switch (operation) {
            case 1:
                calc.add(Double.parseDouble(_f), Double.parseDouble(_s));
                res = calc.getResult();
                System.out.println("Result: " + res + "\nDo you need result to calculate?(yes/no): ");
                break;
            case 2:
                calc.mines(Double.parseDouble(_f), Double.parseDouble(_s));
                res = calc.getResult();
                System.out.println("Result: " + res + "\nDo you need result to calculate?(yes/no): ");
                break;
            case 3:
                calc.mult(Double.parseDouble(_f), Double.parseDouble(_s));
                res = calc.getResult();
                System.out.println("Result: " + res + "\nDo you need result to calculate?(yes/no): ");
                break;
            case 4:
                calc.del(Double.parseDouble(_f), Double.parseDouble(_s));
                res = calc.getResult();
                System.out.println("Result: " + res + "\nDo you need result to calculate?(yes/no): ");
                break;
            case 5:
                calc.pow(Double.parseDouble(_f), Double.parseDouble(_s));
                res = calc.getResult();
                System.out.println("Result: " + res + "\nDo you need result to calculate?(yes/no): ");
                break;
            case 6:
                System.exit(1);
            default:
                System.out.println("Not in menu!");
        }
    }
    public void menu(Calculator calc,String first, String second,double res ){
        Scanner scan = new Scanner(System.in);
        int operation;
        do {
            System.out.println("first:" + first + " second: " + second + "\n1.'+';\n2.'-';\n3.'*';\n4.'/';\n5.'^';\n6.Exit program!");
            operation = scan.nextInt();
            switcher(calc, first, second, operation, res);
            String useRe = scan.next();
            useRe.toLowerCase();
            if (useRe.equals("yes")) {
                useRes = true;
                break;
            } else {
                useRes = false;
                calc.cleanResult();
                break;
            }
           // UsingResult(calc, useRes);
        }while ((operation > 0 || operation < 8));
    }
    public boolean UsingResult(Calculator calc, boolean use){
        this.useRes = use;
        Scanner scan = new Scanner(System.in);
        String useResult = scan.next();
        useResult.toLowerCase();
        if (useResult.equals("yes")) {
            useRes = true;
            //break;
        } else {
            useRes = false;
            calc.cleanResult();
            //break;
        }
        return useRes;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Run run = new Run();
        Calculator calc = new Calculator();
        String exit = "no";
        //boolean useResult = false;
        String first, second, third;
        do {
             //run.res = calc.getResult();
            if (!run.useRes) {
                System.out.println("Input first number: ");
                first = scan.next();
                System.out.println("Input second number: ");
                second = scan.next();
                System.out.println("Choose operation: ");

                run.menu(calc, first, second, run.res);
            } else {
                System.out.println("Input second number: ");
                third = scan.next();
                System.out.println("Choose operation: ");
                run.menu(calc, Double.toString(run.res), third, run.res);
            }
        } while (!exit.equals("yes"));
    }
}


