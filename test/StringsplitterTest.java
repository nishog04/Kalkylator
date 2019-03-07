import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StringsplitterTest {

    @Test
    public void calculateExpression(){

        Stringsplitter sp = new Stringsplitter(); // Arrange

        String actual = sp.calculateExpression("5+6/2*2"); // Act

        assertEquals(actual,"11.0"); // Assert
    }
}