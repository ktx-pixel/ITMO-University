package pokemons;

import moves.particularmoves.Charm;

public class Kirlia extends Ralts {
    public Kirlia(String name, int level) {
        super(name, level);
        this.setStats(38,35,35,65,55,50);

        this.addMove(new Charm());
    }
}
