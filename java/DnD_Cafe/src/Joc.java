public class Joc {
    String nume, gen;
    Double taxaInchiriere;
    Integer bucatiDisponibile;

    public Joc(String nume, String gen, Double taxaInchiriere, Integer bucatiDisponibile) {
        this.nume = nume;
        this.taxaInchiriere = taxaInchiriere;
        this.gen = gen;
        this.bucatiDisponibile = bucatiDisponibile;
    }
}
