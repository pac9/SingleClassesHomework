import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator (8, 2);
    }

    @Test
    public void getNum1(){
        assertEquals(8, calculator.getNum1());
    }

    @Test
    public void getNum2(){
        assertEquals(2, calculator.getNum2());
    }

    @Test
    public void addition(){
        assertEquals(10, calculator.addition());
    }

    @Test
    public void substraction(){
        assertEquals(6, calculator.substraction());
    }

    @Test
    public void divide(){
        assertEquals(4, calculator.divide());
    }

    @Test
    public void multiply(){
        assertEquals(16, calculator.multiply());

    }


}

