import java.util.ArrayList;

public class Comanda {
    Angajat responsabil;
    Client servit;
    Masa loc;
    ArrayList<Produs> consumabile;
    ArrayList<Inchiriere> sedinte;

    public Comanda(Angajat responsabil, Client servit, Masa loc) {
        this.responsabil = responsabil;
        this.servit = servit;
        this.loc = loc;
    }

    public void AfisareComanda() {
        System.out.println("Clientul " + servit.prenume + " " + servit.prenume + " la masa " + loc.numar + ", chelner " + responsabil.prenume + " " + responsabil.nume);
        System.out.println("A comandat:");
        for(int i = 0; i < consumabile.size(); i++) {
            System.out.println(consumabile.get(i).nume + " " + consumabile.get(i).pret);
        }
        System.out.println("A inchiriat:");
        for(int i = 0; i < sedinte.size(); i++) {
            System.out.println(sedinte.get(i).alegere.nume + " " + sedinte.get(i).numarMinute);
        }
    }

    
}
