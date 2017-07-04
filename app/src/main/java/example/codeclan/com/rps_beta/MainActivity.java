package example.codeclan.com.rps_beta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

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

    public void onButtonClickSetPlayerMove(){

    }






    //TODO new up a game - done
    //TODO new CPU - done
    //TODO new Player - done
    //TODO layout buttons an shit - done
    //TODO when button is pressed it sets the players move
    //TODO computer moves
    //TODO compare moves
    //TODO display winner called > string
    //TODO intent with display winner string
    //TODO pass intent to new activity -- results page


}
