package example.codeclan.com.rps_beta;

import behaviours.Move;

/**
 * Created by user on 04/07/2017.
 */

public class Player {

    private Move move;

    public void setMove(Move move) {
        this.move = move;
    }

    public Move getMove() {
        return move;
    }

    // Player player = new Player();
    // player.setMove(Move.ROCK);
}
