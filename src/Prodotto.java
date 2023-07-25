public class Prodotto {
    private int codice;
    private String nome;
    private String marca;
    private double prezzo;
    private double iva;

    public Prodotto(int codice, String nome, String marca, double prezzo, double iva) {
        this.codice = codice;
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getIva() {
        return iva;
    }

    public double getPrezzoConIva() {
        return prezzo + (prezzo * (iva/100));
    }

    @Override
    public String toString() {
        return "Codice: " + codice + ", Nome: " + nome + ", Marca: " + marca + ", Prezzo: " + prezzo + ", IVA: " + iva + "%";
    }
}
