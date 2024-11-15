package pokemons;

import moves.particularmoves.DoubleTeam;
import moves.particularmoves.TeeterDance;
import moves.specialmoves.EnergyBall;
import moves.specialmoves.FocusBlast;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Meloetta extends Pokemon {
    public Meloetta(String name, int level) {
        super(name, level);
        this.setType(Type.NORMAL, Type.PSYCHIC);
        this.setStats(100, 77, 77, 128, 128, 90);

        this.addMove(new EnergyBall());
        this.addMove(new FocusBlast());
        this.addMove(new DoubleTeam());
        this.addMove(new TeeterDance());

    }
}
