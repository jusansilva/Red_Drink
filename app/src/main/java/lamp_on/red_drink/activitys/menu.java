package lamp_on.red_drink.activitys;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import lamp_on.red_drink.R;

public class menu extends AppCompatActivity {
    Button play;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_menu);



        play = (Button)findViewById(R.id.btn_menu);
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.demonstra);
        mp.start();

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it = new Intent(menu.this,game.class);
                startActivity(it);
            }
        });
    }
}
