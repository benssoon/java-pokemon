public class Squirtle extends WaterPokemon {

    // Constants
    private static final String POKEDEX_ENTRY = "After birth, its back swells and hardens into a shell. Powerfully sprays foam from its mouth.";
    private static final String CRY = "Squirt-Squirtle!";

    // Constructors
    public Squirtle(String name, String pokeball) {
        super(name, pokeball);
        this.setSpecies("Squirtle");
        this.setPokedexEntry(POKEDEX_ENTRY);
        this.setCry(CRY);
        this.setHp(30);
    }

    public Squirtle(String name) {
        this(name, "Poké Ball");
    }

    public Squirtle() {
        this("SQUIRTLE");
    }
}
