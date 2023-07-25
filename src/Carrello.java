import java.util.ArrayList;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        ArrayList<Prodotto> carrello = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Inserisci un prodotto : 1 per Smartphone , 2 per Televisori, 3 per Cuffie o 0 per uscire:");
            int scelta = input.nextInt();

            if (scelta == 0) {
                break;
            }

            System.out.println("Inserisci il codice:");
            int codice = input.nextInt();

            System.out.println("Inserisci il nome:");
            String nome = input.next();

            System.out.println("Inserisci la marca:");
            String marca = input.next();

            System.out.println("Inserisci il prezzo:");
            double prezzo = input.nextDouble();

            System.out.println("Inserisci l'IVA:");
            double iva = input.nextDouble();

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci l'IMEI:");
                    String imei = input.next();

                    System.out.println("Inserisci la quantità di memoria (GB):");
                    int memoria = input.nextInt();

                    carrello.add(new Smartphone(codice, nome, marca, prezzo, iva, imei, memoria));
                    break;
                case 2:
                    System.out.println("Inserisci le dimensioni (pollici):");
                    double dimensioni = input.nextDouble();

                    System.out.println("Lo smart TV? (Si/No):");
                    boolean smart = input.next().equalsIgnoreCase("si");

                    carrello.add(new Televisori(codice, nome, marca, prezzo, iva, dimensioni, smart));
                    break;
                case 3:
                    System.out.println("Inserisci il colore:");
                    String colore = input.next();

                    System.out.println("Le cuffie sono wireless? (Si/No):");
                    boolean wireless = input.next().equalsIgnoreCase("si");

                    carrello.add(new Cuffie(codice, nome, marca, prezzo, iva, colore, wireless));
                    break;
                default:
                    System.out.println("Prodotto non riconosciuto.");
            }
        }

        for (Prodotto prodotto : carrello) {
            System.out.println(prodotto);
            System.out.println("Il prezzo totale è: " + prodotto.getPrezzoConIva());
        }
    }
}