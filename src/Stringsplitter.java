import java.util.ArrayList;
import java.util.StringTokenizer;

public class Stringsplitter {

    Parsing p = new Parsing();
    Calculator calc = new Calculator();
    ArrayList<String> a = new ArrayList<>();

    double d1;
    double d2;
    Double dres;
    String result = "";

    public String calculateExpression(String expression){

        /*
        *
        *   Här lagras den emottagna strängen i form av tokens. Sifferkombinationer
        *   och operatorer var för sig.
        *
        */

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
            String s = a.get(1).trim();

            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("%")){
                d1 = p.parseToDouble(a.get(0));
                d2 = p.parseToDouble(a.get(2));

                switch (s){
                    case "+":
                        calc.add(d1,d2);
                        break;
                    case "-":
                        calc.subtract(d1,d2);
                        break;
                    case "*":
                        calc.multiply(d1,d2);
                        break;
                    case "/":
                        calc.divide(d1,d2);
                        break;
                    case "%":
                        calc.modulo(d1,d2);
                        break;
                }

                for (int x = 0; x < 3; x++){
                    a.remove(0);
                }

                result = p.parseToString(calc.res);
                a.add(0,result);
            }
        }

        return result;
    }
}
