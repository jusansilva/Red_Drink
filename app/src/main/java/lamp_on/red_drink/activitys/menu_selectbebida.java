package lamp_on.red_drink.activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import lamp_on.red_drink.R;

public class menu_selectbebida extends AppCompatActivity {

    private Button bebida1, bebida2, bebida3, bebida4, bebida5, bebida6, bebida7, bebida8, bebida9, gogame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_selectbebida);

        bebida1 = (Button)findViewById(R.id.bebida1);
        bebida2 = (Button)findViewById(R.id.bebida2);
        bebida3 = (Button)findViewById(R.id.bebida3);
        bebida4 = (Button)findViewById(R.id.bebida4);
        bebida5 = (Button)findViewById(R.id.bebida5);
        bebida6 = (Button)findViewById(R.id.bebida6);
        bebida7 = (Button)findViewById(R.id.bebida7);
        bebida8 = (Button)findViewById(R.id.bebida8);
        bebida9 = (Button)findViewById(R.id.bebida9);
        gogame = (Button)findViewById(R.id.gogame);

        gogame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(menu_selectbebida.this, game.class);
                startActivity(it);
            }
        });


    }
}
