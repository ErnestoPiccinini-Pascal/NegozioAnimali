class Pappagallo extends Animale {
    private boolean parla;

    public Pappagallo(String nome, boolean parla) {
        super(nome);
        this.parla = parla;
    }

    @Override
    public void faiVerso() {
        String azione = parla ? "ripete quello che dici!" : "fischietta.";
        System.out.println(nome + " (Pappagallo) " + azione);
    }
}
