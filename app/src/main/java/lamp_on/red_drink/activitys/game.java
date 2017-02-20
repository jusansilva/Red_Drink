package lamp_on.red_drink.activitys;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

import lamp_on.red_drink.R;

public class game extends AppCompatActivity {

    private AlertDialog alerta;


    private Button btn1, btn2, btn3, btn4, btn5;
    int n;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_activity);


        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);




        Random act = new Random(10);
        int ba6 = act.nextInt(4);





            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Random rand1 = new Random();
                    int bn1 = rand1.nextInt();
                    final boolean cont1 = bn1 % 2 == 0;
                    Random act = new Random();
                    int bn6 = act.nextInt(3);

                    if(bn6 == 3) {
                        btn1.setBackgroundResource(R.drawable.cheio);
                        btn2.setBackgroundResource(R.drawable.cheio);
                        btn3.setBackgroundResource(R.drawable.cheio);
                        btn4.setBackgroundResource(R.drawable.cheio);
                        btn5.setBackgroundResource(R.drawable.cheio);
                        Intent it = new Intent(game.this, um.class);
                        startActivity(it);

                    }else{

                        if (cont1 == true) {
                            btn1.setBackgroundResource(R.drawable.cheio);


                            if (bn6 == 0) {
                                Intent it = new Intent(game.this, meio.class);
                                startActivity(it);
                            } else if (bn6 == 1) {
                                Intent it = new Intent(game.this, um.class);
                                startActivity(it);
                            } else if (bn6 == 2) {
                                Intent it = new Intent(game.this, dois.class);
                                startActivity(it);
                            }
                        } else {

                            proximo myDialog1 = new proximo();
                            myDialog1.show(getSupportFragmentManager(), "");
                        }
                    }
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Random rand2 = new Random();
                    Integer bn2 = Integer.valueOf(rand2.nextInt());
                    final boolean cont2 = bn2 % 2 == 0;
                    Random act = new Random();
                    int bn6 = act.nextInt(3);

                    if(bn6 == 3) {
                        btn1.setBackgroundResource(R.drawable.cheio);
                        btn2.setBackgroundResource(R.drawable.cheio);
                        btn3.setBackgroundResource(R.drawable.cheio);
                        btn4.setBackgroundResource(R.drawable.cheio);
                        btn5.setBackgroundResource(R.drawable.cheio);
                        Intent it = new Intent(game.this, um.class);
                        startActivity(it);

                    }else{


                    if (cont2 == true) {
                        btn2.setBackgroundResource(R.drawable.cheio);
                        if (bn6 == 0) {
                            Intent it = new Intent(game.this, meio.class);
                            startActivity(it);
                        } else if (bn6 == 1) {
                            Intent it = new Intent(game.this, um.class);
                            startActivity(it);
                        } else if (bn6 == 2) {
                            Intent it = new Intent(game.this, dois.class);
                            startActivity(it);


                        }
                    } else {


                        proximo myDialog1 = new proximo();
                        myDialog1.show(getSupportFragmentManager(), "");
                        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.demonstra);
                        mp.start();
                    }
                }}
            });

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    Random rand3 = new Random();
                    Integer bn3 = Integer.valueOf(rand3.nextInt());
                    final boolean cont3 = bn3 % 2 == 0;
                    Random act = new Random();
                    int bn6 = act.nextInt(3);
                    if(bn6 == 3) {
                        btn1.setBackgroundResource(R.drawable.cheio);
                        btn2.setBackgroundResource(R.drawable.cheio);
                        btn3.setBackgroundResource(R.drawable.cheio);
                        btn4.setBackgroundResource(R.drawable.cheio);
                        btn5.setBackgroundResource(R.drawable.cheio);
                        Intent it = new Intent(game.this, um.class);
                        startActivity(it);

                    }else{

                    if (cont3 == true) {
                        btn3.setBackgroundResource(R.drawable.cheio);
                        if (bn6 == 0) {
                            Intent it = new Intent(game.this, meio.class);
                            startActivity(it);
                        } else if (bn6 == 1) {
                            Intent it = new Intent(game.this, um.class);
                            startActivity(it);
                        } else if (bn6 == 2) {
                            Intent it = new Intent(game.this, dois.class);
                            startActivity(it);
                        }
                    } else {


                        proximo myDialog1 = new proximo();
                        myDialog1.show(getSupportFragmentManager(), "");
                        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.demonstra);
                        mp.start();
                    }

                }}

            });

            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    Random rand4 = new Random();
                    Integer bn4 = Integer.valueOf(rand4.nextInt());
                    final boolean cont4 = bn4 % 2 == 0;
                    Random act = new Random();
                    int bn6 = act.nextInt(3);

                    if(bn6 == 3) {
                        btn1.setBackgroundResource(R.drawable.cheio);
                        btn2.setBackgroundResource(R.drawable.cheio);
                        btn3.setBackgroundResource(R.drawable.cheio);
                        btn4.setBackgroundResource(R.drawable.cheio);
                        btn5.setBackgroundResource(R.drawable.cheio);
                        Intent it = new Intent(game.this, um.class);
                        startActivity(it);

                    }else{


                    if (cont4 == true) {
                        btn4.setBackgroundResource(R.drawable.cheio);
                        if (bn6 == 0) {
                            Intent it = new Intent(game.this, meio.class);
                            startActivity(it);
                        } else if (bn6 == 1) {
                            Intent it = new Intent(game.this, um.class);
                            startActivity(it);
                        } else if (bn6 == 2) {
                            Intent it = new Intent(game.this, dois.class);
                            startActivity(it);
                        }
                    } else {


                        proximo myDialog1 = new proximo();
                        myDialog1.show(getSupportFragmentManager(), "");
                        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.demonstra);
                        mp.start();
                    }

                }}
            });

            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    Random rand5 = new Random();
                    Integer bn5 = Integer.valueOf(rand5.nextInt());
                    final boolean cont5 = bn5 % 2 == 0;
                    Random act = new Random();
                    int bn6 = act.nextInt(3);

                    if(bn6 == 3) {
                        btn1.setBackgroundResource(R.drawable.cheio);
                        btn2.setBackgroundResource(R.drawable.cheio);
                        btn3.setBackgroundResource(R.drawable.cheio);
                        btn4.setBackgroundResource(R.drawable.cheio);
                        btn5.setBackgroundResource(R.drawable.cheio);
                        Intent it = new Intent(game.this, um.class);
                        startActivity(it);

                    }else{

                    if (cont5 == true) {
                        btn5.setBackgroundResource(R.drawable.cheio);

                        if (bn6 == 0) {
                            Intent it = new Intent(game.this, meio.class);
                            startActivity(it);
                        } else if (bn6 == 1) {
                            Intent it = new Intent(game.this, um.class);
                            startActivity(it);
                        } else if (bn6 == 2) {
                            Intent it = new Intent(game.this, dois.class);
                            startActivity(it);
                        }
                    } else {

                        proximo myDialog1 = new proximo();
                        myDialog1.show(getSupportFragmentManager(), "");
                        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.demonstra);
                        mp.start();
                    }

                }}
            });


        }

    }


