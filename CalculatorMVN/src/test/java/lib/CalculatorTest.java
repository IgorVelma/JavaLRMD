package lib;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

//    @Test
//    public void calculateNumbers() {
//    }
//
//    @Test
//    public void getResult() {
//    }
//
//    @Test
//    public void clearResult() {
//    }
    @Test
    public void addNumbersTest(){
        Calculator calculator = new Calculator();
        calculator.addNumbers(1.0, 1.0);
        assertEquals(2.0, calculator.getResult(), 0.1);
    }
    @Test
    public void addNegative(){
        Calculator calculator = new Calculator();
        calculator.addNumbers(-4, -3);
        assertEquals(-7, calculator.getResult(), 0.1);
    }
    @Test
    public void addNegativePositive(){
        Calculator calculator = new Calculator();
        calculator.addNumbers(-4, 0);
        assertEquals(-4, calculator.getResult(), 0.1);
    }
    @Test
    public void minusNumbers(){
        Calculator calculator = new Calculator();
        calculator.minusNumbers(1.0, 1.0);
        assertEquals(0, calculator.getResult(), 0.1);
    }
    @Test
    public void minusNumbersNegative(){
        Calculator calculator = new Calculator();
        calculator.minusNumbers(-1.0, -1.0);
        assertEquals(0, calculator.getResult(), 0.1);
    }
    @Test
    public void minusNumbersNegativePositive(){
        Calculator calculator = new Calculator();
        calculator.minusNumbers(-1.0, 1.0);
        assertEquals(-2, calculator.getResult(), 0.1);
    }
    @Test
    public void divideNumbers(){
        Calculator calculator = new Calculator();
        calculator.divideNumbers(1.0, 1.0);
        assertEquals(1, calculator.getResult(), 0.1);
    }
    @Test
    public void divideNumbersNegative(){
        Calculator calculator = new Calculator();
        calculator.divideNumbers(-1.0, -1.0);
        assertEquals(1, calculator.getResult(), 0.1);
    }
    @Test
    public void divideNumbersNegativePositive(){
        Calculator calculator = new Calculator();
        calculator.divideNumbers(-1.0, 1.0);
        assertEquals(-1, calculator.getResult(), 0.1);
    }
    @Test
    public void multNumbers(){
        Calculator calculator = new Calculator();
        calculator.multiplyNumbers(1.0, 1.0);
        assertEquals(1, calculator.getResult(), 0.1);
    }
    @Test
    public void multNumbersNegative(){
        Calculator calculator = new Calculator();
        calculator.multiplyNumbers(-1.0, -1.0);
        assertEquals(1, calculator.getResult(), 0.1);
    }
    @Test
    public void multNumbersNegativePositive(){
        Calculator calculator = new Calculator();
        calculator.multiplyNumbers(-1.0, 1.0);
        assertEquals(-1, calculator.getResult(), 0.1);
    }
    @Test
    public void powNumbersNegativePositiveEven(){
        Calculator calculator = new Calculator();
        calculator.powNumbers(-2.0, 2);
        assertEquals(4, calculator.getResult(), 0.1);
    }
    @Test
    public void powNumbersNegativePositiveOdd(){
        Calculator calculator = new Calculator();
        calculator.powNumbers(-2.0, 3);
        assertEquals(-8, calculator.getResult(), 0.1);
    }
    @Test
    public void powNumbers(){
        Calculator calculator = new Calculator();
        calculator.powNumbers(2.0, 2);
        assertEquals(4, calculator.getResult(), 0.1);
    }
    @Test
    public void powNumbersWithNegativePow(){
        Calculator calculator = new Calculator();
        calculator.powNumbers(2.0, -2);
        assertEquals(0.25, calculator.getResult(), 0.1);
    }
    @Test
    public void powNumbersNegativeEvenWithNegativePow(){
        Calculator calculator = new Calculator();
        calculator.powNumbers(-2.0, -2);
        assertEquals(0.25, calculator.getResult(), 0.1);
    }
    @Test
    public void powNumbersNegativeOddWithNegativePow(){
        Calculator calculator = new Calculator();
        calculator.powNumbers(-2.0, -3);
        assertEquals(-0.125, calculator.getResult(), 0.1);
    }
    @Test
    public void clearResultTest(){
        Calculator calculator = new Calculator();
        calculator.addNumbers(2, 2);
        calculator.clearResult();
        assertEquals(0, calculator.getResult(), 0.1);
    }
}