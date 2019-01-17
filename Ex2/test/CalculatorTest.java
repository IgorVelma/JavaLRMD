import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator calculator = new Calculator();
        calculator.add(1.0d, 1.0d);
        assertEquals(2.0, calculator.getResult(), 0.1);
    }
    @Test
    public void pow(){
        Calculator c = new Calculator();
        c.pow(2, 2);
        assertEquals(4, c.getResult(), 0.1);
    }
    @Test
    public void UseRes(){
        Run r = new Run();
        Calculator calc = new Calculator();
//        r.UsingResult(false);
//        assertEquals();
    }
}