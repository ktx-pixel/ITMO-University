package moves.physicalmoves;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze(){
        super(Type.GROUND, 60, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().stat(Stat.SPEED, -1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "does Bulldoze";
    }

}
