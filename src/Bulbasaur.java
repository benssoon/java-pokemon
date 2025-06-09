public class Bulbasaur extends GrassPokemon {

    // Constants
    private static final String POKEDEX_ENTRY = "A strange seed was planted on its back at birth. The plant sprouts and grows with this Pokémon.";




    public Bulbasaur(String name, String pokeball) {
        super(name, pokeball);
        this.setSpecies("Bulbasaur");
        this.pokedexEntry = POKEDEX_ENTRY;
    }

    public Bulbasaur(String pokeball) {
        this("BULBASAUR", pokeball);
    }

    public Bulbasaur() {
        this("Poké Ball");
    }


}

