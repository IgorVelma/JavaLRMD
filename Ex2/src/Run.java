
import java.util.Scanner;

public class Run {
    public static void switcher(Calculator calc, String _f, String _s, int operation, double res) {
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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Calculator calc = new Calculator();
        String exit = "no";
        boolean useResult = false;
        String first, second, third;
        do {
            double res = calc.getResult();
            if (!useResult) {
                System.out.println("Input first number: ");
                first = scan.next();
                System.out.println("Input second number: ");
                second = scan.next();
                System.out.println("Choose operation: ");
                int operation;
                do {
                    System.out.println("first:" +first+" second: "+second+"\n1.'+';\n2.'-';\n3.'*';\n4.'/';\n5.'^';\n6.Exit program!");
                    operation = scan.nextInt();
                    switcher(calc, first, second, operation, res);
                    String useRes = scan.next();
                    useRes.toLowerCase();
                    if (useRes.equals("yes")) {
                        useResult = true;
                        break;
                    } else {
                        useResult = false;
                        calc.cleanResult();
                        break;
                    }
                } while ((operation > 0 || operation < 8));
            } else {

                System.out.println("Input second number: ");
                third = scan.next();
                System.out.println("Choose operation: ");
                int operation;
                do {
                    System.out.println("first:" +res+" second: "+third+"\n1.'+';\n2.'-';\n3.'*';\n4.'/';\n5.'^';\n6.Exit program!");
                    operation = scan.nextInt();
                    switcher(calc, Double.toString(res), third, operation, res);
                    String useRes = scan.next();
                    useRes.toLowerCase();
                    if (useRes.equals("yes")) {
                        useResult = true;
                        break;
                    } else {
                        calc.cleanResult();
                        useResult = false;
                        break;
                    }
                } while ((operation > 0 || operation < 8));
            }
        } while (!exit.equals("yes"));
    }
}


