import org.junit.Test;

import java.util.ArrayList;
import java.util.StringTokenizer;


public class StringsplitterTest {

    @Test
    public void calculateExpression() {
        // Arrange
        Calculator calc = new Calculator();
        ArrayList<String> a = new ArrayList<>();
        StringTokenizer st = new StringTokenizer("123+4-5*6/2%2", "+*/%-", true);

        // Act
        while(st.hasMoreTokens()){
            a.add(st.nextToken());
        }

        // Assert




    }
}