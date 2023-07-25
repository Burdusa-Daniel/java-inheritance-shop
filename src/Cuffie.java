public class Cuffie extends Prodotto {
    private String colore;
    private boolean wireless;

    public Cuffie(int codice, String nome, String marca, double prezzo, double iva, String colore, boolean wireless) {
        super(codice, nome, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

    public String getColore() {
        return colore;
    }

    public boolean isWireless() {
        return wireless;
    }

    @Override
    public String toString() {
        return super.toString() + ", Colore: " + colore + ", Wireless: " + (wireless ? "Si" : "No");
    }
}
