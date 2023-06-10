// SCRIVERE REGEX PER VERIFICARE SE STRINGA E' UN INDIRIZZO EMAIL.
// SICCOME VERIFICARE CON UNA REGEX COME OGNI POSSIBILE MODO IN CUI UN INDIRIZZO EMAIL PUO' ESSERE SCRITTO
// SI VERIFICHERA' INDIRIZZO EMAIL BASE: first.last@domain.com

public class Exercise5 {
    public static void main(String[] args) {
        String email = "mario.rossi@mail.com";
        String regex = "(?<firstName>\\w+).?(?<lastName>\\w+)@(?<domain>\\w+\\.)+\\w+";
//        Indico che il dominio potrebbe essere anche del tipo @mail.cb.com mettendo il + dopo la parentesi del domain
//        Avrei anche potuto scrivere (?<domain>\\w+.) senza backslash prima del punto, ma così c'è un controllo in più


        System.out.println(email.matches(regex));
    }
}
