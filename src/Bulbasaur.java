public class Bulbasaur extends GrassPokemon {

    // Constants
    private static final String POKEDEX_ENTRY = "A strange seed was planted on its back at birth. The plant sprouts and grows with this Pokémon.";
    private static final String CRY = "Bulba!";

    // Properties

    // Constructors
    public Bulbasaur(String name, String pokeball) {
        super(name, pokeball);
        this.setSpecies("Bulbasaur");
        this.setPokedexEntry(POKEDEX_ENTRY);
        this.setCry(CRY);
        this.setHp(50);
    }

    public Bulbasaur(String name) {
        this(name, "Poké Ball");
    }

    public Bulbasaur() {
        this("BULBASAUR");
    }




}

