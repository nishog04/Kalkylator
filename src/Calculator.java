public class Calculator {


    double res;

    /*
    *
    *   Metoderna nedan tar emot två stängvärden och gör om dessa till doubles.
    *   Efter det utförs aktuell kalkyl och sedan görs double-resultatet
    *   om till ett strängvärde, som i sin tur returneras.
    *
    */

    public Double add(double d1, double d2){
        res = d1+d2;
        return res;
    }

    public Double subtract(double d1, double d2){
        res = d1-d2;
        return res;
    }

    public Double multiply(double d1, double d2){
        res = d1*d2;
        return res;
    }

    public Double divide(double d1, double d2){
        if (d2 == 0.0){
            throw new ArithmeticException("Det går inte att dividera med 0!");
        }
        res = d1/d2;
        return res;
    }

    public Double modulo(double d1, double d2){
        res = d1%d2;
        return res;
    }
}
