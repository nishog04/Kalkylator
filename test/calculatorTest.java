import org.junit.Test;

import static org.junit.Assert.*;

public class calculatorTest {

    Calculator calc = new Calculator(); // Arrange

    @Test
    public void add(){
        double actual = Double.parseDouble(calc.add("1.1","2.2"));  // Act
        assertEquals(3.3d,actual,0.111);        // Assert
    }

    @Test
    public void subtract(){
        double actual = Double.parseDouble(calc.subtract("2.2","1.1"));  // Act
        assertEquals(1.1, actual, 0.111);       // Assert
    }

    @Test
    public void multiply() {
        double actual = Double.parseDouble(calc.multiply("5","2"));  // Act
        assertEquals(10.0,actual,0.111);        // Assert
    }

    @Test
    public void divide(){
        double actual = Double.parseDouble(calc.divide("4","2"));  // Act
        assertEquals(2.0d, actual,0.111);       // Assert
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZero(){
        double actual = Double.parseDouble(calc.divide("2","0"));   // Act
        assertEquals(new ArithmeticException("Det går inte att dividera med 0!"), actual);  // Assert
    }

    @Test
    public void modulo(){
        double actual = Double.parseDouble(calc.modulo("5","2"));   // Act
        assertEquals(1.0, actual, 0.111);       // Assert
    }
}