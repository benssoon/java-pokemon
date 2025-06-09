public abstract class DualTypePokemon extends Pokemon {

    protected String type1;
    protected String type2;

    // Constructor
    public DualTypePokemon(String name, String pokeball, String type1, String type2) {
        super(name, pokeball);
        this.type = type1 + "/" + type2;
        this.type1 = type1;
        this.type2 = type2;
    }

    public String getType(int ordinal) {
        return switch (ordinal) {
            case 1 -> this.getType1();
            case 2 -> this.getType2();
            default -> this.type;
        };
    }

    public String getType1() {
        return this.type1;
    }

    public String getType2() {
        return this.type2;
    }
}
