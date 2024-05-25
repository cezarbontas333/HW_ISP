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
            if (locuri[i].statusMasa()) {
                Comanda nou = new Comanda(this, om, locuri[i]);
                lista.add(nou);
                locuri[i].schimbareDisponibilitate();
                return true;
            }
        }
        return false;
    }

    public void terminareComanda(Comanda comanda) {
        if (comanda.status == StatusComanda.PLATIT) {
            comanda.loc.schimbareDisponibilitate();
            comanda.consumabile.clear();
            comanda.sedinte.clear();
            lista.remove(comanda);
        }
    }
}
