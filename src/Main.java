import java.util.*;

public class Main {

    public static void main(String[] args) {

        Stringsplitter sp = new Stringsplitter();
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "*--------------------------*\n" +
                "|                          |\n" +
                "|        KALKYLATOR        |\n" +
                "|                          |\n" +
                "*--------------------------*");

        System.out.println("Ange vad du vill räkna ut:");
        String expression = scanner.next();
        sp.calculateExpression(expression);

        System.out.println(sp.result);
    }
}
