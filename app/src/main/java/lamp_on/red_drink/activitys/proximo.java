package lamp_on.red_drink.activitys;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;

import lamp_on.red_drink.R;

/**
 * Created by Jusan magno on 14/09/2016.
 */
public class proximo extends DialogFragment { //esse exemplo usa a herança de: import android.support.v4.app.DialogFragment;

    public Dialog onCreateDialog(Bundle savedInstanceState) {

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.proximo, null); //SETAR AQUI A SUA VIEW
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(view);
        builder.setTitle("Escapou dessa, Proximo jogador!");
        builder.setPositiveButton("OK", null);
        //builder.setNeutralButton("ALGO", null);
        return builder.create();
    }
}