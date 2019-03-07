public class Parsing {


    Double d;
    String s;

    public Double parseToDouble(String s){ // sträng parsas till double
        d = Double.parseDouble(s);
        return d;
    }

    public String parseToString(double d){ // double parsas till sträng
        s = String.valueOf(d);
        return s;
    }


}
