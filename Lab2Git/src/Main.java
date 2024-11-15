import pokemons.Gallade;
import pokemons.Kirlia;
import pokemons.Meloetta;
import pokemons.Mudsdale;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Meloetta meloetta = new Meloetta("Капуста", 15);
        Kirlia relts2 = new Kirlia("Кастрюля", 15);
        Mudsdale mudsdale = new Mudsdale("Картопля", 15);
        Gallade gallade = new Gallade("Арбуз", 15);

        Battle battle = new Battle();
        battle.addAlly(meloetta);
        battle.addAlly(mudsdale);
        battle.addFoe(relts2);
        battle.addFoe(gallade);
        battle.go();
    }
}