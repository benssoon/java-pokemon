public abstract class Pokemon {

    // Properties
    private String name;
    private String species;
    private String pokeball;
    private String type;
    private String pokedexEntry;
    private String cry;
    private int hp;

    // Constructor
    public Pokemon(String name, String pokeball) {
        this.setName(name);
        this.setPokeball(pokeball);
    }

    // Getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getPokeball() {
        return this.pokeball;
    }

    public void setPokeball(String pokeball) {
        this.pokeball = pokeball;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPokedexEntry() {
        return this.pokedexEntry;
    }

    public void setPokedexEntry(String pokedexEntry) {
        this.pokedexEntry = pokedexEntry;
    }

    public String getCry() {
        return this.cry;
    }

    public void setCry(String cry) {
        this.cry = cry;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    // Methods
    public void cry() {
        System.out.println(this.getCry());
    }

    public void dealDamage(int damage, Pokemon opponent) {
        int newHP = opponent.getHp() - damage;
        opponent.setHp(newHP);
    }

    public void takeDamage(int damage) {
        int newHP = this.getHp() - damage;
        this.setHp(newHP);
    }


}

