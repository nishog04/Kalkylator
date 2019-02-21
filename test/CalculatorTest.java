import org.junit.Test;

import java.awt.geom.Rectangle2D;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void add(){
        double actual = Double.parseDouble(calc.add("1.1","2.2"));
        assertEquals(3.3d,actual,0.111);
    }

    @Test
    public void sub(){
        double actual = Double.parseDouble(calc.sub("2.2","1.1"));
        assertEquals(1.1, actual, 0.111);
    }

    @Test
    public void mul() {
        double actual = Double.parseDouble(calc.mul("5","2"));
        assertEquals(10.0,actual,0.111);
    }

    @Test
    public void div() {
        double actual = Double.parseDouble(calc.div("4","2"));
        assertEquals(2.0d, actual,0.111);
    }
}