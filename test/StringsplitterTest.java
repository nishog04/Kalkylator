import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StringsplitterTest {

    @Test
    public void calculateExpression(){  // Testar en "vanlig" uträkning

        Stringsplitter sp = new Stringsplitter(); // Arrange

        String actual = sp.calculateExpression("5+6/2*2"); // Act

        assertEquals(actual,"11.0"); // Assert
    }

    @Test
    public void calculateExpressionWithDecimals(){  // Testar att använda punkter i insträngen

        Stringsplitter sp = new Stringsplitter(); // Arrange

        String actual = sp.calculateExpression("5.0+5.0*4.0/2.0"); // Act

        assertEquals(actual,"20.0"); // Assert
    }

    @Test(expected=NumberFormatException.class)
    public void calculateExpressionWithCommas(){  // Testar att använda kommatecken istället för punkt

        Stringsplitter sp = new Stringsplitter(); // Arrange

        String actual = sp.calculateExpression("5,0+5,0"); // Act

        assertEquals(actual,"");  // Assert
    }

    /*
    * Miniräknaren läser alltid av operatorn på index[1]. Misstämmer ordningen (om operatorn ligger på
    * t.ex index[0]) kommer miniräknaren inte klara av att hantera detta. Testmetoden nedan visar att
    * resultatet blir en tom sträng.
     */

    @Test
    public void calculateExpressionWithExpectedError(){

        Stringsplitter sp = new Stringsplitter(); // Arrange

        String actual = sp.calculateExpression("-2+20"); // Act

        assertEquals(actual, ""); // Assert
    }

    /*
    * Miniräknaren klarar naturligtvis inte av bokstäver. I testet nedan försöker användaren skriva in
    * ordet "Hej", vilket resulterar i att programmet avslutas.
     */

    @Test
    public void CalculateExpressionWithLetters(){
        Stringsplitter sp = new Stringsplitter();  // Arrange

        String actual = sp.calculateExpression("Hej");  // Act

        assertEquals(actual,"");  // Assert
    }
}