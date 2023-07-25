public class Televisori extends Prodotto {
    private double dimensioni;
    private boolean smart;

    public Televisori(int codice, String nome, String marca, double prezzo, double iva, double dimensioni, boolean smart) {
        super(codice, nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }

    public double getDimensioni() {
        return dimensioni;
    }

    public boolean isSmart() {
        return smart;
    }

    @Override
    public String toString() {
        return super.toString() + ", Dimensioni: " + dimensioni + " pollici" + ", Smart: " + (smart ? "Si" : "No");
    }
}
