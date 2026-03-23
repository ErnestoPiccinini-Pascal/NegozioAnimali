package negozioanimali;

class Pesce extends Animale {
    private String acqua; // dolce, salata

    public Pesce(String nome,int eta, String acqua) {
        super(nome,eta);
        this.acqua = acqua;
    }

    @Override
    public String verso() {
        return (this.getNome() + " è un pesce di acqua " + acqua + " e nuota in silenzio.");
    }

    @Override
    public String descrizione() {
        return (this.getNome() + " è un pesce di acqua " + acqua );
    }
}
