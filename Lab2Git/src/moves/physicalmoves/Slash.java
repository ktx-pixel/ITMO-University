package moves.physicalmoves;


import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;


// Slash deals damage and has an increased critical hit ratio (1⁄8 instead of 1⁄24).
public class Slash extends PhysicalMove {
    public Slash() {
        super(Type.NORMAL,70, 100);
    }
    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if (att.getStat(Stat.SPEED) / 170.0 > Math.random()) {
            System.out.println(att + "critical");
            return 2.0;
        } else {
            return 1.0;
        }
    }
    @Override
    protected String describe() {
        return "does Slash";
    }
}
