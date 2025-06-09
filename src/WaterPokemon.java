public abstract class WaterPokemon extends Pokemon {

    // Constants
    private static final String WEAKNESS = "grass";

    // Constructor
    public WaterPokemon(String name, String pokeball) {
        super(name, pokeball);
        this.setType("water");
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
