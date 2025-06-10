public abstract class FirePokemon extends Pokemon {

    // Constants
    private static final String WEAKNESS = "water";

    // Constructor
    public FirePokemon(String name, String pokeball) {
        super(name, pokeball);
        this.setType("fire");
    }

    @Override
    public void takeDamage(int damage, String move, String moveType) {
        if (WEAKNESS.equals(moveType)) {
            System.out.println("It's super effective!");
            damage *= 2;
        }
        super.takeDamage(damage, move, moveType);
    }
}