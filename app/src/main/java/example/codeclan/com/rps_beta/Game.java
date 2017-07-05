package example.codeclan.com.rps_beta;

import behaviours.Move;

import static behaviours.Move.PAPER;
import static behaviours.Move.ROCK;
import static behaviours.Move.SCISSORS;

/**
 * Created by user on 04/07/2017.
 */

public class Game {


    private Player player;
    private Computer computer;


    public Game() {
        player = new Player();
        computer = new Computer();

    }

    public int compareMoves(Move playerMove, Move computerMove) {
        if (playerMove == computerMove) {
            return 0;
        }
        switch (playerMove) {
            case ROCK:
                return (computerMove == SCISSORS ? 1 : -1);
            case PAPER:
                return (computerMove == ROCK ? 1 : -1);
            case SCISSORS:
                return (computerMove == PAPER ? 1 : -1);
            default:
                return 0;
//            quite common to allocate a win to 1 and a loss to -1, draw is 0
        }
    }


    public String displayWinner(int result) {
        switch (result) {
            case 0:
                return "It's a draw";
            case 1:
                return"Player wins";
            case -1:
                return "Computer wins";
        }
        return null;
    }


}
