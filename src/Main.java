public class Main {
    public static void main(String[] args) {

        /*

        1. Bedenk of het mogelijk zou zijn om een abstracte klasse te implementeren in deze applicatie. En zo ja, implementeer deze abstracte klasse dan in jouw project.

        2. Bedenk of het mogelijk zou zijn om één of meer abstracte methodes te implementeren. En zo ja, implementeer deze!

        3. Probeer een manier te vinden waardoor één Pokèmon twee verschillende types tegelijk zou kunnen zijn. Kun je dit implementeren?

        */


        Bulbasaur bulb = new Bulbasaur("Bulby", "Great Ball");
        System.out.printf("Your %s's name is %s and it is a %s-type Pokémon. %s was caught in a %s.\n\nPokédex entry:\n%s\n\n", bulb.getSpecies(), bulb.getName(), bulb.getType(), bulb.getName(), bulb.getPokeball(), bulb.getPokedexEntry());

        Bulbasaur bob = new Bulbasaur("Bob");
        Squirtle squire = new Squirtle("Squire");
        Charizard chuck = new Charizard("Chuck");

        bob.addMove("Leech seed", 10);
        bob.addMove("Vine whip", 18);

        bulb.addMove("Razor leaf", 20);

        squire.addMove("Bubblebeam", 15);


        System.out.printf("%s is battling %s!\n", bob.getName(), squire.getName());
        bob.cry();
        squire.cry();
        bob.attack(squire, "Leech seed");
        squire.attack(bob, "Bubblebeam");
        bob.attack(squire, "Vine whip");

        bob.attack(bulb, "Leech seed");

        chuck.cry();
        System.out.println(chuck.getSpecies() + chuck.getName());
        System.out.println(chuck.getType());
    }
}