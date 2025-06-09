public class Charizard extends DualTypePokemon {

    // Constants
    private static final String POKEDEX_ENTRY = "Spits fire that is hot enough to melt boulders. Known to cause forest fires unintentionally.";
    private static final String CRY = "CHAAAAAH!";

    // Constructors
    public Charizard(String name, String pokeball) {
        super(name, pokeball, "fire", "flying");
        this.setSpecies("Charizard");
        this.setPokedexEntry(POKEDEX_ENTRY);
        this.setCry(CRY);
        this.setHp(100);
    }

    public Charizard(String name) {
        this(name, "Poké Ball");
    }

    public Charizard() {
        this("CHARIZARD");
    }
}
