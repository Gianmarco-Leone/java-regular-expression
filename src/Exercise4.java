// SCRIVERE REGEX CHE VERIFICA SE UNA STRINGA E' UN INDIRIZZO E CHE PERMETTA DI ESTRARNE LE PARTI

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise4 {
    public static void main(String[] args) {
        String address = "12345 Funny St., Big City, NY 90210";
        String regex = "(?<streetNum>\\d+)\\s+(?<streetName>.*?),\\s*(?<city>.*?),\\s*(?<state>[A-Z]{2})\\s*(?<postCode>\\d{5})";
//        ESEMPI PER CAPIRE MEGLIO E TESTARE I Greedy Operators .* .*?
//        String regex = "(?<streetNum>\\d+)\\s+(?<streetName>.*)"; Funny St., Big City, NY 90210
//        String regex = "(?<streetNum>\\d+)\\s+(?<streetName>.*),"; Funny St., Big City
//        String regex = "(?<streetNum>\\d+)\\s+(?<streetName>.*,)"; Funny St., Big City,
//        String regex = "(?<streetNum>\\d+)\\s+(?<streetName>.*?)"; VUOTO
//        String regex = "(?<streetNum>\\d+)\\s+(?<streetName>.*?),"; Funny St.
//        String regex = "(?<streetNum>\\d+)\\s+(?<streetName>.*?,)"; Funny St.,

        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(address);

//        if (mat.matches()){
//            System.out.println(mat.group("streetNum"));
//            System.out.println(mat.group("streetName"));
//            System.out.println(mat.group("city"));
//            System.out.println(mat.group("state"));
//            System.out.println(mat.group("postCode"));
//        }

//        SECONDO MODO
        mat.find();
        System.out.println(mat.group("streetNum"));
        System.out.println(mat.group("streetName"));
        System.out.println(mat.group("city"));
        System.out.println(mat.group("state"));
        System.out.println(mat.group("postCode"));
    }
}
