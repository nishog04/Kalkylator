import org.junit.Test;

import static org.junit.Assert.*;

public class ParsingTest {

    Parsing p = new Parsing(); // Arrenge

    @Test
    public void parseToDouble() {
        double actual = p.parseToDouble("5");   // Act

        assertEquals(5d,actual,0.111); // Assert
    }

    @Test
    public void parseToString() {
        String actual = p.parseToString(5.3); // Act

        assertEquals("5.3", actual); // Assert
    }
}