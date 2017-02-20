package lamp_on.red_drink.activitys;


import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.purplebrain.adbuddiz.sdk.AdBuddiz;

import lamp_on.red_drink.R;

public class meio extends AppCompatActivity {

    Button btn_v5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.d_meio);

        AdBuddiz.setPublisherKey("6e17d9f1-6288-453b-b474-9b673156377b");
        AdBuddiz.RewardedVideo.show(this); // this = current Activity

        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.ooooo);
        mp.start();


        btn_v5 = (Button)findViewById(R.id.btn_v5);

        btn_v5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(meio.this, game.class);
                startActivity(it);
            }
        });


    }


}
