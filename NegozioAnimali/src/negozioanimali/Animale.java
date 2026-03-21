public abstract class Animale {

    private String nome;
    private int eta;

    // Costruttore
    public Animale(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    // Getter
    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    // Metodo astratto: verso dell'animale
    public abstract String verso();

    // Metodo astratto: descrizione dell'animale
    public abstract String descrizione();

    // Metodo concreto toString()
    @Override
    public String toString() {
        return descrizione();
    }
}
