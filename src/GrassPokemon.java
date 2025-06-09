public abstract class GrassPokemon extends Pokemon {

    // Constructor
    public GrassPokemon(String name, String pokeball) {
        super(name, pokeball);
        this.type = "water";
    }

    public String getType() {
        return this.type;
    }
}

