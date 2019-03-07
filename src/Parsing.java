public class Parsing {


    Double d;
    String s;

    public Double parseToDouble(String s){
        d = Double.parseDouble(s);
        return d;
    }

    public String parseToString(double d){
        s = String.valueOf(d);
        return s;
    }


}
