public class Calculator {
    private double result;

    public void add (double ... params){
        for (double x: params){
            result+=x;
        }
    }
    public void mines(double _firstNumb, double _secondNumber){
        result = _firstNumb - _secondNumber;
    }
    public void mult(double _firstNumb, double _secondNumber){
        result = _firstNumb * _secondNumber;
    }
    public void del(double _firstNumb, double _secondNumber){
        result = _firstNumb / _secondNumber;
    }
    public void pow(double _firstNumb, double _secondNumber){
        result = _firstNumb;
        for(int i=1; i<_secondNumber; ++i){
            result *= _firstNumb;
        }
    }

    public double getResult(){
        return result;
    }
    public void cleanResult(){
        result=0;
    }
}
