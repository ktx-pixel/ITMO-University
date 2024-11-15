package pokemons;


import moves.physicalmoves.Slash;

public class Gallade extends Kirlia {
    public Gallade(String name, int level){
        super(name, level);
        this.setStats(68,125,65, 65, 115,80);

        this.addMove(new Slash());

    }

}
