// COME SI POSSONO USARE LE PARENTESI () PER GROUPING MA SENZA "CAPTURING"

public class Exercise3 {
    public static void main(String[] args) {
//        String regex = "A(?:[bg])racada\\1ra"; Non è più possibile utilizzare \\1 perchè [bg] non sono state "captured"
        String regex = "A(?:[bg])racada[bg]ra";
        System.out.println("Abracadabra".matches(regex));
        System.out.println("Agracadagra".matches(regex));
    }
    }

