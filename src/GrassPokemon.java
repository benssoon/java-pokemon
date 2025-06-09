public abstract class GrassPokemon extends Pokemon {

    // Contants
    private static final String IMMUNITY = "Leech Seed";
    private static final String WEAKNESS = "fire";

    // Properties
    private boolean immune;


    // Getters and setters
    public boolean isImmune() {
        return this.immune;
    }

    public void setImmune(boolean immune) {
        this.immune = immune;
    }

    // Constructor
    public GrassPokemon(String name, String pokeball) {
        super(name, pokeball);
        this.setType("grass");
    }

    // Methods
    public void checkImmunity(String move) {
        this.setImmune(move.equals(IMMUNITY));
    }

    @Override
    public void takeDamage(int damage, String move, String moveType) {
        this.checkImmunity(move);
        if (!this.isImmune()) {
            if (WEAKNESS.equals(moveType)) {
                damage *= 2;
            }
            super.takeDamage(damage, move, moveType);
        }
        else {
            System.out.printf("%s is immune to %s!\n", this.getName(), move);
        }
    }
}