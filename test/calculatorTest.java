import org.junit.Test;

import static org.junit.Assert.*;

public class calculatorTest {

    Calculator calc = new Calculator(); // Arrange

    @Test
    public void add(){  // Testar addition
        double actual = calc.add(1.1,2.2);  // Act
        assertEquals(3.3d,actual,0.111);    // Assert
    }

    @Test
    public void subtract(){  // Testar subraktion
        double actual = calc.subtract(2.2,1.1);  // Act
        assertEquals(1.1, actual, 0.111);   // Assert
    }

    @Test
    public void multiply(){  // Testar multiplikation
        double actual = calc.multiply(5,2);  // Act
        assertEquals(10.0,actual,0.111);    // Assert
    }

    @Test
    public void multiplyByZero(){  // Testar multiplicera med 0
        double actual = calc.multiply(5,0); // Act
        assertEquals(actual,0.0,0.111);   // Assert
    }

    @Test
    public void divide(){  // Testar division
        double actual = calc.divide(4,2);  // Act
        assertEquals(2.0d, actual,0.111);   // Assert
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZero(){  // Testar dividera med 0
        double actual = calc.divide(2,0);   // Act
        assertEquals(new ArithmeticException("Det går inte att dividera med 0!"), actual);  // Assert
    }

    @Test
    public void modulo(){  // Testar modulus
        double actual = calc.modulo(5,2);   // Act
        assertEquals(1.0, actual, 0.111);   // Assert
    }
}