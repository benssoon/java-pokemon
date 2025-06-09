public abstract class Pokemon {

    // Properties
    private String name;
    private String species;
    protected String pokeball;
    protected String type;
    protected String pokedexEntry;

    // Constructor
    public Pokemon(String name, String pokeball) {
        this.name = name;
        this.pokeball = pokeball;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getPokeball() {
        return this.pokeball;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String newSpecies) {
        this.species = newSpecies;
    }

    public String getPokedexEntry() {
        return this.pokedexEntry;
    }

    public abstract String getType();

}

