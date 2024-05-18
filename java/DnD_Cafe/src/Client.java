import java.util.ArrayList;

public class Client {
    String nume, prenume;
    Integer varsta;
    Comanda comanda;

    public Client(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void atribuireComanda(Comanda asta) {
        this.comanda = asta;
    }

    Boolean comandaProdus(Integer idProdus, ArrayList<Produs> meniu) {
        if (meniu.isEmpty())
            return false;
        for (int i = 0; i < meniu.size(); i++) {
            if (idProdus == meniu.get(i).ID) {
                if (meniu.get(i).categorie.equals("Bere") && this.varsta < 18)
                    return false;
                else {
                    comanda.adaugareProdus(meniu.get(i));
                    return true;
                }
            }
        }
        return false;
    }

    Boolean inchiriereJoc(Integer idJoc, Integer numarMinute, ArrayList<Joc> jocuri) {
        if (jocuri.isEmpty())
            return false;
        for (int i = 0; i < jocuri.size(); i++) {
            if (idJoc == jocuri.get(i).ID) {
                comanda.adaugareSedinta(jocuri.get(i), numarMinute);
                return true;
            }
        }
        return false;
    }
}
