import java.util.ArrayList;

public class Angajat {
    String nume, prenume;
    Double salariu;
    ArrayList<Comanda> lista;

    public Angajat(String nume, String prenume, Double salariu) {
        this.nume = nume;
        this.prenume = prenume;
        this.salariu = salariu;
        lista = new ArrayList<Comanda>();
    }

    public Boolean creareComanda(Client om, Masa[] locuri) {
        int i;
        for (i = 0; i < locuri.length; i++) {
            if (locuri[i].disponibilitate == Disponibilitate.LIBER) {
                Comanda nou = new Comanda(this, om, locuri[i]);
                lista.add(nou);
                return true;
            }
        }
        return false;
    }

    public void eliberareMasa() {

    }
}
