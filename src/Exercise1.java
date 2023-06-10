// SCRIVI UNA REGEX IN GRADO DI MATCHARE CON QUESTE 3 PAROLE: Dark, bark, Lark
// COME CHALLENGE AGGIUNGI IL MATCH CON: stark

public class Exercise1 {
    public static void main(String[] args) {
        String regex = "[DbL]ark";

        System.out.println("Dark".matches(regex));
        System.out.println("bark".matches(regex));
        System.out.println("Lark".matches(regex));

//        CHALLENGE
        String regex2 = "(st|[DbL]|fgb)ark";

        System.out.println("Dark".matches(regex2));
        System.out.println("bark".matches(regex2));
        System.out.println("Lark".matches(regex2));
        System.out.println("stark".matches(regex2));
        System.out.println("stark".matches(regex2));
    }
}
