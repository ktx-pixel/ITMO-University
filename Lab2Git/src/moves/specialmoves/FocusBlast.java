package moves.specialmoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class FocusBlast extends SpecialMove {
    public FocusBlast(){
        super(Type.FIGHTING, 120, 70, 5, 10);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.1) {
            Effect effect = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
            pokemon.addEffect(effect);
        }
    }

    @Override
    protected String describe(){
        return "does Focus Blast";
    }
}
