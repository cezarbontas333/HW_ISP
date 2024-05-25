public class Masa {
    Disponibilitate disponibilitate;
    Integer numar;

    public Masa(Disponibilitate disponibilitate, Integer numar) {
        this.disponibilitate = disponibilitate;
        this.numar = numar;
    }

    public Boolean statusMasa() {
        switch (disponibilitate) {
            case LIBER:
                System.out.println("Masa este libera");
                return true;

            case OCUPAT:
                System.out.println("Masa este ocupata");
                return false;

            default:
                System.out.println("Exceptie disponibilitate camp inexistent");
                return false;
        }
    }

    public void schimbareDisponibilitate() {
        if(disponibilitate == Disponibilitate.LIBER)
            disponibilitate = Disponibilitate.OCUPAT;
        else
            disponibilitate = Disponibilitate.LIBER;
    }
}
