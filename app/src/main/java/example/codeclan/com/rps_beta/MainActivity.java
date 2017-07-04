package example.codeclan.com.rps_beta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import behaviours.Move;

import static android.R.attr.button;
import static behaviours.Move.ROCK;

public class MainActivity extends AppCompatActivity {

    Game game;
    Player player;
    Computer computer;
    Button rockButton;
    Button paperButton;
    Button scissorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        game = new Game();
        player = new Player();
        computer = new Computer();

        rockButton = (Button)findViewById(R.id.rockButton);
        paperButton = (Button)findViewById(R.id.paperButton);
        scissorButton = (Button)findViewById(R.id.scissorsButton);

    }

//    public void onButtonClick(View Button){
//        Intent intent = new Intent(this, ResultsActivity.class);
//        if button == rockButton {
//            player.setMove(Move.ROCK);
//        } else if (button == paperButton) {
//            player.setMove(Move.PAPER);
//        } else if (button == scissorButton){
//            intent.putExtra("winner", player.getMove());
//            this.startActivity(intent);
//        }
//    }
// the above doesn't like int's and =='s


    public void onRockButtonClickSetPlayerMoveRock(View rockButton){
        player.setMove(ROCK);
        int winner = game.compareMoves(player.getMove(), computer.getMove());

        Intent intent = new Intent(this, ResultsActivity.class);
        intent.putExtra("winner", game.displayWinner(winner));
        startActivity(intent);
    }

    public void onPaperButtonClickSetPlayerMovePaper(View paperButton){
        player.setMove(Move.PAPER);
        int winner = game.compareMoves(player.getMove(), computer.getMove());

        Intent intent = new Intent(this, ResultsActivity.class);
        intent.putExtra("winner", game.displayWinner(winner));
        startActivity(intent);
    }

    public void onPaperButtonClickSetPlayerMoveScissors(View paperButton){
        player.setMove(Move.SCISSORS);
        int winner = game.compareMoves(player.getMove(), computer.getMove());

        Intent intent = new Intent(this, ResultsActivity.class);
        intent.putExtra("winner", game.displayWinner(winner));
        startActivity(intent);
    }




}



    //TODO new up a game - done
    //TODO new CPU - done
    //TODO new Player - done
    //TODO layout buttons an shit - done
    //TODO when button is pressed it sets the players move - done
    //TODO computer moves - done
    //TODO compare moves - done
    //TODO display winner called > string
    //TODO intent with display winner string
    //TODO pass intent to new activity -- results page



