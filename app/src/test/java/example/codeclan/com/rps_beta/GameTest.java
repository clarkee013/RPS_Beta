package example.codeclan.com.rps_beta;

import org.junit.Before;
import org.junit.Test;

import behaviours.Move;

import static behaviours.Move.ROCK;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 04/07/2017.
 */

public class GameTest {

    Game game;

    @Before
    public void before(){
        game = new Game();
    }

    @Test
    public void canCompareMoves(){
        assertEquals(0,game.compareMoves(Move.ROCK, Move.ROCK));
    }

    @Test
    public void canCompareMove_win() throws Exception {
        assertEquals(1, game.compareMoves(Move.ROCK, Move.SCISSORS));

    }

    @Test
    public void canCompareMove_lose(){
        assertEquals(-1, game.compareMoves(Move.ROCK, Move.PAPER));
    }

    @Test
    public void canDisplayWinner_Player(){
        assertEquals("Player wins", game.displayWinner(1));
    }

    @Test
    public void canDisplayWinner_Computer(){
        assertEquals("Computer wins", game.displayWinner(-1));
    }

    @Test
    public void canDisplayWinner_Draw(){
        assertEquals("It's a draw", game.displayWinner(0));
    }

    @Test
    public void canGetPlayerCounter(){
        assertEquals(0, game.playerCounter());
    }

    @Test
    public void canGetComputerCounter(){
        assertEquals(0, game.computerCounter());
    }

    @Test
    public void canGetDrawCounter(){
        assertEquals(0, game.drawCounter());
    }

    @Test
    public void canDisplayGameStreak(){
        assertEquals("Player has won 0 games, Computer has won 0 games. There have been 0 draws.", game.displayGameStreak());
    }

}




