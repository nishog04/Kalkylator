import java.util.ArrayList;
import java.util.StringTokenizer;

public class Stringsplitter {

    String result = "";

    public String calculateExpression(String expression){

        Calculator calc = new Calculator();

        /*
        *
        *   Här lagras den emottagna strängen i form av tokens. Sifferkombinationer
        *   och operatorer var för sig.
        *
        */

        ArrayList<String> a = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(expression, "+*/%-", true);

        while(st.hasMoreTokens()){
            a.add(st.nextToken());
        }

        /*
        *
        *   Undersöker vilken typ av operator som lagrats i index 1 (alltså token 2).
        *   Därefter körs en while-loop tills arraylistan enbart innehåller ett
        *   enda element (resultatet av uträkningen/uträkningarna).
        *
        */

        while (a.size() > 1){
            if (a.get(1).contains("+")){            // Index 1 innehåller "+"
                calc.add(a.get(0),a.get(2));        // Anropar metoden add, som tar två värden (element 1 och 3)
                a.remove(0);                 // Raderar index[0] 3 ggr
                a.remove(0);
                a.remove(0);
                a.add(0,calc.res);           // Lägger till uträkningsresultatet som ny index[0]
            }
            else if (a.get(1).contains("-")){
                calc.subtract(a.get(0),a.get(2));   // Anropar metoden subtract, som tar två värden (element 1 och 3)
                a.remove(0);                 // Raderar index[0] 3 ggr
                a.remove(0);
                a.remove(0);
                a.add(0,calc.res);           // Lägger till uträkningsresultatet som ny index[0]
            }
            else if (a.get(1).contains("*")){
                calc.multiply(a.get(0),a.get(2));   // Anropar metoden multiply, som tar två värden (element 1 och 3)
                a.remove(0);                 // Raderar index[0] 3 ggr
                a.remove(0);
                a.remove(0);
                a.add(0,calc.res);           // Lägger till uträkningsresultatet som ny index[0]
            }
            else if (a.get(1).contains("/")){
                calc.divide(a.get(0),a.get(2));    // Anropar metoden divide, som tar två värden (element 1 och 3)
                a.remove(0);                // Raderar index[0] 3 ggr
                a.remove(0);
                a.remove(0);
                a.add(0,calc.res);          // Lägger till uträkningsresultatet som ny index[0]
            }
            else if (a.get(1).contains("%")){
                calc.modulo(a.get(0),a.get(2));    // Anropar metoden modulo, som tar två värden (element 1 och 3)
                a.remove(0);                // Raderar index[0] 3 ggr
                a.remove(0);
                a.remove(0);
                a.add(0,calc.res);          // Lägger till uträkningsresultatet som ny index[0]
            }
            else {
                System.out.println("Fel i inmatningen!");
                break;
            }
        }

        result = calc.res;
        return result;
    }
}
