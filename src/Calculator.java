public class Calculator {

    double d1;
    double d2;
    double dres;
    String res = "";

    public String add(String s1, String s2){
        d1 = Double.parseDouble(s1); // Parse to double på strängarna
        d2 = Double.parseDouble(s2);
        dres = d1+d2;     // Uträkning
        res = dres+"";          // Parse to String

        return res;
    }

    public String sub(String s1, String s2){
        d1 = Double.parseDouble(s1);
        d2 = Double.parseDouble(s2);
        dres = d1-d2;
        res = dres+"";

        return res;
    }

    public String mul(String s1, String s2){
        d1 = Double.parseDouble(s1);
        d2 = Double.parseDouble(s2);
        dres = d1*d2;
        res = dres+"";

        return res;
    }

    public String div(String s1, String s2){
        d1 = Double.parseDouble(s1);
        d2 = Double.parseDouble(s2);
        dres = d1/d2;
        res = dres+"";

        return res;
    }


}
