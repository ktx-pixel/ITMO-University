package moves.particularmoves;

import ru.ifmo.se.pokemon.*;

public class TeeterDance extends StatusMove {

    @Override
    protected void applyOppEffects(Pokemon def){
        Effect.confuse(def);
    }

    @Override
    protected String describe() {
        return "does Teeter Dance";
    }
}
