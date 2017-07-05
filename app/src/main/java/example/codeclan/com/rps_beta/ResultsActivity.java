package example.codeclan.com.rps_beta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    Game game;
    Player player;
    Computer computer;

    TextView winnerView;
    TextView playerView;
    TextView computerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);


        winnerView = (TextView) findViewById(R.id.winnerView);
        playerView = (TextView) findViewById(R.id.playerView);
        computerView = (TextView) findViewById(R.id.computerView);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String answer = extras.getString("answer");
        answerText.setText(answer);
    }
}



// TODO attach winnerView TextBox
// TODO attach playerView TextBox
// TODO attach computerView TextBox

