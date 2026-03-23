class Pesce extends Animale {
    private String acqua; // dolce, salata

    public Pesce(String nome, String acqua) {
        super(nome);
        this.acqua = acqua;
    }

    @Override
    public void faiVerso() {
        System.out.println(nome + " è un pesce di acqua " + acqua + " e nuota in silenzio.");
    }
}
