package moves.particularmoves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        this.type = Type.PSYCHIC;
        Effect effect = new Effect().stat(Stat.HP, (int) pokemon.getStat(Stat.HP));
        pokemon.addEffect(effect);
        Effect.sleep(pokemon);
    }

    @Override
    protected String describe() {
        return "does Rest";
    }
}
