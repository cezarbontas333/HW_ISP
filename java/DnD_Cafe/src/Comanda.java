import java.util.ArrayList;

public class Comanda {
    Angajat responsabil;
    Client servit;
    Masa loc;
    StatusComanda status;
    ArrayList<Produs> consumabile;
    ArrayList<Inchiriere> sedinte;

    public Comanda(Angajat responsabil, Client servit, Masa loc) {
        this.responsabil = responsabil;
        this.servit = servit;
        servit.atribuireComanda(this);
        this.loc = loc;
        consumabile = new ArrayList<Produs>();
        sedinte = new ArrayList<Inchiriere>();
        this.status = StatusComanda.NEPLATIT;
        /*
         * for (int i = 0; i < meniu.size(); i++) {
         * consumabile.add(0);
         * }
         */
    }

    public void adaugareProdus(Produs alegere) {
        consumabile.add(alegere);
    }

    public void adaugareSedinta(Joc alegere, Integer numarMinute) {
        sedinte.add(new Inchiriere(numarMinute, alegere));
    }

    public Double getPretTotal() {
        Double total = 0.0;
        Double pretC = 0.0;
        Double pretS = 0.0;
        for (int i = 0; i < consumabile.size(); i++) {
            pretC = pretC + consumabile.get(i).pret;
        }
        for (int i = 0; i < sedinte.size(); i++) {
            pretS = pretS + sedinte.get(i).alegere.taxaInchiriere * sedinte.get(i).numarMinute;
        }
        total = pretS + pretC;
        return total;
    }

    public void AfisareComanda() {
        System.out.println("Clientul " + servit.prenume + " " + servit.prenume + " la masa " + loc.numar + ", chelner "
                + responsabil.prenume + " " + responsabil.nume);
        System.out.println("A comandat:");
        for (int i = 0; i < consumabile.size(); i++) {
            System.out.println(consumabile.get(i).nume + " " + consumabile.get(i).pret);
        }
        System.out.println("A inchiriat:");
        for (int i = 0; i < sedinte.size(); i++) {
            System.out.println(sedinte.get(i).alegere.nume + " " + sedinte.get(i).numarMinute);
        }
        System.out.println("Pretul total al comenzii: " + getPretTotal());
        
    }

}
