/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package negozioanimali;

/**
 *
 * @author piccininie
 */
public class NegozioAnimali {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // Creazione gestione negozio
        GestioneNegozio negozio;
        negozio = new GestioneNegozio();
        // Dichiarazione animali
        Gatto gatto1;
        Cane cane1;
        Pesce pesce1;
        Pappagallo pappagallo1;
        Cane cane2;
        // Assegnazione animali
        gatto1 = new Gatto("Micio", 2, "Siamese");
        cane1 = new Cane("Fido", 4, "Grande");
        pesce1 = new Pesce("Nemo", 1, "Salata");
        pappagallo1 = new Pappagallo("Lillo", 3, true);
        cane2 = new Cane("Buddy", 5, "Media");
        // Aggiunta animali al negozio
        negozio.aggiungiAnimale(gatto1);
        negozio.aggiungiAnimale(cane1);
        negozio.aggiungiAnimale(pesce1);
        negozio.aggiungiAnimale(pappagallo1);
        negozio.aggiungiAnimale(cane2);
        // Stampa tutti gli animali
        System.out.println("=== Lista animali ===");
        negozio.stampaAnimali();
        // Conta animali
        int numero;
        numero = negozio.contaAnimali();
        System.out.println("\nNumero animali: " + numero);
        // Ricerca animale
        Animale trovato;
        trovato = negozio.cercaPerNome("Fido");
        System.out.println("\n=== Ricerca per nome 'Fido' ===");
        if (trovato != null) {
            System.out.println("Trovato: " + trovato);
        } else {
            System.out.println("Animale non trovato");
        }
        // Rimozione animale
        System.out.println("\n=== Rimozione 'Nemo' ===");
        negozio.rimuoviAnimale("Nemo");
        // Stampa aggiornata
        System.out.println("\n=== Lista aggiornata ===");
        negozio.stampaAnimali();
        // Conteggio finale
        int numeroFinale;
        numeroFinale = negozio.contaAnimali();
        System.out.println("\nNumero animali dopo rimozione: " + numeroFinale);

    }
    
}
