package lib;

public enum MathOperations {
    ADD,
    MINUS,
    MULT,
    DIVIDE,
    POW;


    public static MathOperations getOperation(char symbol) {
        switch (symbol) {
            case '+':
                return ADD;
            case '-':
                return MINUS;
            case '*':
                return MULT;
            case '/':
                return DIVIDE;
            case '^':
                return POW;
            default:
                throw new UnsupportedOperationException(String.valueOf(symbol));
        }
    }
}
