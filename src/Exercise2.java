// USA CAPTURE GROUP PER MATCHARE LE PAROLE Abracadabra e Agracadagra

public class Exercise2 {
    public static void main(String[] args) {
//        UTILIZZO \\1 PER RIUTILIZZARE LO STESSO IDENTICO CARATTERE SELEZIONATO NEL PRIMO
//        CAPTURE GROUP
        String regex = "A([bg])racada\\1ra";
//        POTREI ANCHE DARE UN NOME AL CAPTURE GROUP, MA IN QUEL CASO LO DOVREI RICHIAMARE CON \\k<nome>
//        String regex = "A(?<charChoice>[bg])racada\\k<charChoice>ra";
        System.out.println("Abracadabra".matches(regex));
        System.out.println("Agracadagra".matches(regex));
    }
}
