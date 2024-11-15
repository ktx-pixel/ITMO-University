package moves.particularmoves;
import ru.ifmo.se.pokemon.*;


public class Charm extends StatusMove{

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect effect = new Effect().stat(Stat.HP, -2);
        p.addEffect(effect);
    }

    @Override
    protected String describe(){
        return "does Charm";
    }
}
