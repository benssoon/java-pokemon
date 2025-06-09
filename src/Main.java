public class Main {
    public static void main(String[] args) {

        /*

        1. Bedenk of het mogelijk zou zijn om een abstracte klasse te implementeren in deze applicatie. En zo ja, implementeer deze abstracte klasse dan in jouw project.

        2. Bedenk of het mogelijk zou zijn om één of meer abstracte methodes te implementeren. En zo ja, implementeer deze!

        3. Probeer een manier te vinden waardoor één Pokèmon twee verschillende types tegelijk zou kunnen zijn. Kun je dit implementeren?


        What do pokemon have?
            - a name
            - a type (or two)
            - a species
            - stats
            - four moves
            - pokedex entry
            - pokeball type

        */


        Bulbasaur bulb = new Bulbasaur("Bulby", "Great Ball");
        System.out.printf("Your %s's name is %s and it is a %s-type Pokémon. %s was caught in a %s.\n\nPokédex entry:\n%s\n\n", bulb.getSpecies(), bulb.getName(), bulb.getType(), bulb.getName(), bulb.getPokeball(), bulb.getPokedexEntry());

        Bulbasaur bob = new Bulbasaur();
        Squirtle sq = new Squirtle();

        bob.addMove("Leech seed", 10);
        bulb.addMove("Razor leaf", 20);
        sq.addMove("Bubblebeam", 15);


        bulb.attack(sq, "Razor leaf");
        bob.attack(bulb, "Leech seed");
        sq.attack(bob, "Bubblebeam");

    }
}