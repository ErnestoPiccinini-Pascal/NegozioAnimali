class Cane extends Animale {
    private String taglia; // piccola, media, grande

    public Cane(String nome, String taglia) {
        super(nome);
        this.taglia = taglia;
    }

    @Override
    public void faiVerso() {
        System.out.println(nome + " (Cane taglia " + taglia + ") dice: Bau!");
    }
}
