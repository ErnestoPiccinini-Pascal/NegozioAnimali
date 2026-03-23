package negozioanimali;

class Pappagallo extends Animale {
    private boolean parla;

    public Pappagallo(String nome,int eta, boolean parla) {
        super(nome,eta);
        this.parla = parla;
    }

    @Override
    public String verso() {
        String azione = parla ? "ripete quello che dici!" : "fischietta.";
        return (this.getNome() + " (Pappagallo) " + azione);
    }

    @Override
    public String descrizione() {
        return (this.getNome() + " (Pappagallo) "+"Parla:"+this.parla);
    }
}
