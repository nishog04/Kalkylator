public class Calculator {

    double d1;
    double d2;
    double dres;
    String res = "";

    /*
    *
    *   Metoderna nedan tar emot två stängvärden och gör om dessa till doubles.
    *   Efter det utförs aktuell kalkyl och sedan görs double-resultatet
    *   om till ett strängvärde, som i sin tur returneras.
    *
    */

    public String add(String s1, String s2){
        d1 = Double.parseDouble(s1);
        d2 = Double.parseDouble(s2);
        dres = d1+d2;
        res = dres+"";
        return res;
    }

    public String subtract(String s1, String s2){
        d1 = Double.parseDouble(s1);
        d2 = Double.parseDouble(s2);
        dres = d1-d2;
        res = dres+"";
        return res;
    }

    public String multiply(String s1, String s2){
        d1 = Double.parseDouble(s1);
        d2 = Double.parseDouble(s2);
        dres = d1*d2;
        res = dres+"";
        return res;
    }

    public String divide(String s1, String s2){
        d1 = Double.parseDouble(s1);
        d2 = Double.parseDouble(s2);

        if (d2 == 0.0){     // Kontrollerar om användaren dividerar med 0
            throw new ArithmeticException("Det går inte att dividera med 0!");
        }

        dres = d1/d2;
        res = dres+"";
        return res;
    }

    public String modulo(String s1, String s2){
        d1 = Double.parseDouble(s1);
        d2 = Double.parseDouble(s2);
        dres = d1%d2;
        res = dres+"";
        return res;
    }
}
