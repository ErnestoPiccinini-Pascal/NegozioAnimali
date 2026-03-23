class Gatto extends Animale {
    private String razza;

    public Gatto(String nome, String razza) {
        super(nome);
        this.razza = razza;
    }

    @Override
    public void faiVerso() {
        System.out.println(nome + " (Gatto " + razza + ") dice: Miao!");
    }
}
