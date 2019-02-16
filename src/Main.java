import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        char[] numbers = {'1','2','3','4','5','6','7','8','9','0'};
        char[] operators = {'+','-','*','/'};


        Scanner scanner = new Scanner(System.in);

        ArrayList<String> splitNumbers = new ArrayList<>();
        ArrayList<String> splitOperators = new ArrayList<>();

        System.out.println("Ange vad du vill räkna ut:");
        String userInput = scanner.next();

        StringTokenizer st = new StringTokenizer(userInput, "+-*/", true);

        while (st.hasMoreTokens()){
            String token = st.nextToken();

            if ("+-*/".contains(token)){
                splitOperators.add(token);
            }
            else {
                splitNumbers.add(token);
            }
        }

        System.out.println("Operators: " + splitOperators);
        System.out.println("Numbers: " + splitNumbers);








    }
}
