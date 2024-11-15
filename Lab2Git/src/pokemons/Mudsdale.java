package pokemons;

import moves.specialmoves.FocusBlast;

public class Mudsdale extends Mudbray{
    public Mudsdale(String name, int level){
        super(name, level);
        this.setStats(100, 125, 100, 55, 85, 35);

        this.addMove(new FocusBlast());
    }

}
