package moves.particularmoves;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {

    @Override
    protected void applyOppEffects(Pokemon att){
        Effect effect = new Effect().stat(Stat.SPECIAL_ATTACK, -1);
        att.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "does Confide";
    }
}
