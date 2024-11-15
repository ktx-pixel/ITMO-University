package pokemons;

import moves.particularmoves.Confide;
import moves.physicalmoves.Bulldoze;
import moves.physicalmoves.DoubleKick;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Mudbray extends Pokemon {
    public Mudbray(String name, int level){
        super(name, level);
        this.setType(Type.GROUND);
        this.setStats(70, 100, 70, 45, 55, 45);

        this.addMove(new Bulldoze());
        this.addMove(new Confide());
        this.addMove(new DoubleKick());
    }

}
