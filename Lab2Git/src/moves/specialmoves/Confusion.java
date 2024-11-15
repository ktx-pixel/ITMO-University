package moves.specialmoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Confusion extends SpecialMove {
    public Confusion() {
        super(Type.PSYCHIC, 50, 100, 25, 10);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 1){
            Effect.confuse(pokemon);
            System.out.println(pokemon + " get confuse");
        }
    }

    @Override
    protected String describe() {
        return "does Confusion";
    }
}
