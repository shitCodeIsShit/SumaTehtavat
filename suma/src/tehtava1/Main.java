package tehtava1;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        
        System.out.println();
        
        // Opiskelija otustyyppi
        AterioivaOtus valtteri = new Opiskelija();
        valtteri.aterioi();
        
        System.out.println();
        
        // Valmistunut opiskelija otustyyppi
        AterioivaOtus valmistunutValtteri = new Alumni();
        valmistunutValtteri.aterioi();
    }
}
