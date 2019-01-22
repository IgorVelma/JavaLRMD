package lib;

import org.junit.Test;

import static org.junit.Assert.*;
/**Test of class MathOperations
 * Tests of methods
 * */
public class MathOperationsTest {
    MathOperations mathOperations;

    public MathOperations getOperation(char symbol) throws Exception{
        return MathOperations.getOperation(symbol);
    }

    /**
     * Test, how get the operation
     * */
    @Test
    public void getOperation() throws Exception{
        mathOperations = getOperation('+');
        assertEquals(MathOperations.ADD, mathOperations);
    }
}