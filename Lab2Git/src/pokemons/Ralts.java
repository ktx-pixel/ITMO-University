package pokemons;

import moves.particularmoves.Rest;
import moves.specialmoves.Confusion;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Ralts extends Pokemon {
    public Ralts(String name, int level){
        super(name, level);
        this.setType(Type.PSYCHIC, Type.FAIRY);
        this.setStats(28, 25, 25, 45, 35, 40);

        this.addMove(new Confusion());
        this.addMove(new Rest());
    }

}
