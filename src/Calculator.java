public class Calculator {


    double res;


    // Metoderna nedan tar emot två double-värden, gör kalkylen och returnerar en double.

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
        if (d2 == 0.0){     // If-sats om användaren försöker dividera med 0. Kastar ett ArithmeticExpression
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
