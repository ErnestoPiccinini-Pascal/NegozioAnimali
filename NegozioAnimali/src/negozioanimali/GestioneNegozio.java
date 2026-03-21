package negozioanimali;

import java.util.ArrayList;

public class GestioneNegozio {

    private ArrayList<Animale> animali;

    // Costruttore
    public GestioneNegozio() {
        animali = new ArrayList<>();
    }

    // Aggiunge un animale
    public void aggiungiAnimale(Animale a) {
        animali.add(a);
    }

    // Rimuove un animale per nome
    public void rimuoviAnimale(String nome) {
        for (int i = 0; i < animali.size(); i++) {
            if (animali.get(i).getNome().equals(nome)) {
                animali.remove(i);
                return;
            }
        }
    }

    // Cerca un animale per nome
    public Animale cercaPerNome(String nome) {
        for (Animale a : animali) {
            if (a.getNome().equals(nome)) {
                return a;
            }
        }
        return null;
    }

    // Stampa tutti gli animali
    public void stampaAnimali() {
        for (Animale a : animali) {
            System.out.println(a);
        }
    }

    // Conta gli animali
    public int contaAnimali() {
        return animali.size();
    }
}
