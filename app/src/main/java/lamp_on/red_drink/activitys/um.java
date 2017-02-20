package lamp_on.red_drink.activitys;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.purplebrain.adbuddiz.sdk.AdBuddiz;

import lamp_on.red_drink.R;

public class um extends AppCompatActivity {

    Button btn_v1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.e_um);

        AdBuddiz.setPublisherKey("6e17d9f1-6288-453b-b474-9b673156377b");
        AdBuddiz.RewardedVideo.show(this); // this = current Activity

        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.ooooo);
        mp.start();

        btn_v1 = (Button)findViewById(R.id.btn_v1);

        btn_v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(um.this, game.class);
                startActivity(it);
            }
        });


    }
}
