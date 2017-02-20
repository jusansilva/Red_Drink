package lamp_on.red_drink.activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import lamp_on.red_drink.R;

public class todos extends AppCompatActivity {


    TextView todos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todos);

        todos = (TextView)findViewById(R.id.txt_bebem);

        todos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(todos.this, game.class);
                startActivity(i);
            }
        });
    }
}
