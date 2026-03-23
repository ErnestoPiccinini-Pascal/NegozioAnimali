package negozioanimali;


import negozioanimali.Animale;

class Cane extends Animale {
    private String taglia; // piccola, media, grande

    public Cane(String nome,int eta, String taglia) {
        super(nome,eta);
        this.taglia = taglia;
    }

    @Override
    public String verso() {
        return (this.getNome() + " (Cane taglia " + taglia + ") dice: Bau!");
    }

    @Override
    public String descrizione() {
        return (this.getNome() + " (Cane taglia " + taglia + ")");
    }
}
