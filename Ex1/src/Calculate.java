public class Calculate {
    String first;
    String secong;

    public static double calculate(String[]args) {
        double res = 0.0;
        double first = Double.valueOf(args[0]);
        double second = Double.valueOf(args[2]);
        String operator = args[1];
        switch (operator) {
            case "+":
                res = first + second;
                break;
            case "-":
                res = first - second;
                break;
            case "*":
                res = first * second;
                break;
            case "/":
                res = first / second;
                break;
            case "^":
                    res = first;
                    for (int i = 0; i < second - 1; ++i) {
                        res *= first;
                    }
                break;
                default:
                    System.out.println("wrong operator!");
                    break;
        }
        return res;
    }

    public static void main(String[] args) {
        double res = calculate(args);
        System.out.println("res: " + res);
    }
}
