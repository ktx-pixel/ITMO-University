package moves.particularmoves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {

    @Override
    protected void applyOppEffects(Pokemon att){
        Effect effect = new Effect().stat(Stat.EVASION, 1);
        att.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "does Double Team";
    }
}
