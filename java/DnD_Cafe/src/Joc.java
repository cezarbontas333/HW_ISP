public class Joc {
    String nume;
    Double taxaInchiriere;
    Integer bucatiDisponibile, ID;

    public Joc(String nume, Integer ID, Double taxaInchiriere, Integer bucatiDisponibile) {
        this.nume = nume;
        this.taxaInchiriere = taxaInchiriere;
        this.bucatiDisponibile = bucatiDisponibile;
        this.ID = ID;
    }
}
