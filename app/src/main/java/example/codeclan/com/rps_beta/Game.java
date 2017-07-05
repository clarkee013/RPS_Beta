package example.codeclan.com.rps_beta;

import java.util.ArrayList;

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
    private int drawCounter;
    private int playerCounter;
    private int computerCounter;


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
                drawCounter++;
                return "It's a draw";
            case 1:
                playerCounter++;
                return"Player wins";
            case -1:
                computerCounter++;
                return "Computer wins";
        }
        return null;
    }

    public int drawCounter(){
        drawCounter = 0;
        return drawCounter;
    }

    public int playerCounter(){
        playerCounter = 0;
        return playerCounter;
    }

    public int computerCounter(){
        computerCounter = 0;
        return computerCounter;
    }

    public String displayGameStreak(){
        return "Player has won " +playerCounter +" games, Computer has won " +computerCounter +" games. There have been " +drawCounter +" draws.";
    }


}
