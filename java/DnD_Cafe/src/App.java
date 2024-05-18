import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Citire produse
        ArrayList<Produs> meniu = new ArrayList<Produs>();
        try {
            String caleMeniu = "data\\produse.in";
            File fisierMeniu = new File(caleMeniu);
            Scanner citireMeniu = new Scanner(fisierMeniu);
            Integer idProdus = 0;
            while (citireMeniu.hasNextLine()) {
                String nume = citireMeniu.nextLine();
                String categorie = citireMeniu.nextLine();
                Double pret = citireMeniu.nextDouble();
                meniu.add(new Produs(nume, categorie, idProdus, pret));
                idProdus++;
            }
            citireMeniu.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul de meniu citit prost");
            e.printStackTrace();
        }

        // Citire jocuri
        ArrayList<Joc> jocuri = new ArrayList<Joc>();
        try {
            String caleJocuri = "data\\jocuri.in";
            File fisierJocuri = new File(caleJocuri);
            Scanner citireJocuri = new Scanner(fisierJocuri);
            Integer idJoc = 0;
            while (citireJocuri.hasNextLine()) {
                String nume = citireJocuri.nextLine();
                Double taxa = citireJocuri.nextDouble();
                Integer bucati = citireJocuri.nextInt();
                jocuri.add(new Joc(nume, idJoc, taxa, bucati));
                idJoc++;
            }
            citireJocuri.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul de jocuri citit prost");
            e.printStackTrace();
        }

        // Initializare mese
        try {
            String caleMese = "data\\mese.in";
            File fisierMese = new File(caleMese);
            Scanner meseScanner = new Scanner(fisierMese);
            int numarMese = meseScanner.nextInt();
            Masa locuri[] = new Masa[numarMese];
            for (int i = 0; i < locuri.length; i++)
                locuri[i] = new Masa(Disponibilitate.LIBER, i);
            meseScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul de mese citit prost");
            e.printStackTrace();
        }

        // Citire Angajati
        ArrayList<Angajat> angajati = new ArrayList<Angajat>();
        try {
            String caleAngajati = "data\\angajati.in";
            File fisierAngajati = new File(caleAngajati);
            Scanner citireAngajati = new Scanner(fisierAngajati);
            while (citireAngajati.hasNextLine()) {
                String nume = citireAngajati.nextLine();
                String prenume = citireAngajati.nextLine();
                Double salariu = citireAngajati.nextDouble();
                angajati.add(new Angajat(nume, prenume, salariu));
            }
            citireAngajati.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul de angajati citit prost");
            e.printStackTrace();
        }

        // Citire Clienti
        ArrayList<Client> clienti = new ArrayList<Client>();
        try {
            String caleClienti = "data\\clienti.in";
            File fisierClienti = new File(caleClienti);
            Scanner citireClienti = new Scanner(fisierClienti);
            while (citireClienti.hasNextLine()) {
                String nume = citireClienti.nextLine();
                String prenume = citireClienti.nextLine();
                Integer varsta = citireClienti.nextInt();
                clienti.add(new Client(nume, prenume, varsta));
            }
            citireClienti.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul de clienti citit prost");
            e.printStackTrace();
        }
    }
}
