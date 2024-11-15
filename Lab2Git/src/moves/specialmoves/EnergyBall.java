package moves.specialmoves;


import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;


public class EnergyBall extends SpecialMove {
    public EnergyBall() {
        super(Type.GRASS, 80, 100, 10, 10);
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
        return "does Energy Ball";
    }

}