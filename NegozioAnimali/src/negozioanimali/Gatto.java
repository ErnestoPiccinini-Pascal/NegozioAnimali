package negozioanimali;




class Gatto extends Animale {
    private String razza;

    public Gatto(String nome,int eta, String razza) {
        super(nome,eta);
        this.razza = razza;
    }

    @Override
    public String verso() {
        return (this.getNome() + " (Gatto " + razza + ") dice: Miao!");
    }
    @Override
    public String descrizione() {
        return (this.getNome() + " (Gatto " + razza + ")");
    }
}
