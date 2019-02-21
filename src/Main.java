import java.util.*;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange vad du vill räkna ut:");
        String userInput = scanner.next();


        //  Här lagras den inmatade strängen i form av tokens. Sifferkombinationer
        //  och operatorer var för sig.

        ArrayList<String> a = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(userInput, "+*/-", true);

        while(st.hasMoreTokens()){
            a.add(st.nextToken());
        }

        System.out.println(a);


        // Vilken typ av operator är index 1 (alltså token 2)?

        while (a.size() > 1){
            if (a.get(1).contains("+")){
                calc.add(a.get(0),a.get(2));
                a.remove(0);            // Raderar index[0] tre gånger
                a.remove(0);
                a.remove(0);
                a.add(0,calc.res);     // Lägger till uträkningsresultatet som ny index[0]
            }
            else if (a.get(1).contains("-")){
                calc.sub(a.get(0),a.get(2));
                a.remove(0);
                a.remove(0);
                a.remove(0);
                a.add(0,calc.res);
            }
            else if (a.get(1).contains("*")){
                calc.mul(a.get(0),a.get(2));
                a.remove(0);
                a.remove(0);
                a.remove(0);
                a.add(0,calc.res);
            }
            else if (a.get(1).contains("/")){
                calc.div(a.get(0),a.get(2));
                a.remove(0);
                a.remove(0);
                a.remove(0);
                a.add(0,calc.res);
            }
            else {
                System.out.println("Fel");
            }

        }



        System.out.println("Svaret på " + userInput + " är: " + calc.res);
        System.out.println(a);



    }
}
