public class Smartphone extends Prodotto {
    private String imei;
    private int memoria;

    public Smartphone(int codice, String nome, String marca, double prezzo, double iva, String imei, int memoria) {
        super(codice, nome, marca, prezzo, iva);
        this.imei = imei;
        this.memoria = memoria;
    }

    public String getImei() {
        return imei;
    }

    public int getMemoria() {
        return memoria;
    }

    @Override
    public String toString() {
        return super.toString() + ", IMEI: " + imei + ", Memoria: " + memoria + "GB";
    }
}
