package com.example.android.udacityquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*Define a global variable to handle the scores*/
    int score = 0;





    /*Define RadioButtons for the correct answer*/
    RadioButton option13,
            option34,
            option41,
            option51,
            option82;

    /*Define variables for the checkboxes*/
    CheckBox option21, option22, option23, option24,
            option61, option62, option63, option64,
            option71, option72, option73, option74;

    /*Function to handle the submit*/
    public void getResult(View view) {
        /*Reset score back to zero every time the submit is called */
        score = 0;


        /*Get the name of the player*/
        EditText nameText = (EditText) findViewById(R.id.name);
        String names = nameText.getText().toString();

/*Question 1 answer*/
        option13 = (RadioButton) findViewById(R.id.option13);
        boolean options13 = option13.isChecked();

        if (options13) {
            score += 1;
        }
/*Question 3 answer*/
        option34 = (RadioButton) findViewById(R.id.option34);
        boolean options34 = option34.isChecked();

        if (options34) {
            score += 1;
        }
/*Question 4 answer*/
        option41 = (RadioButton) findViewById(R.id.option41);
        boolean options41 = option41.isChecked();

        if (options41) {
            score += 1;
        }
/*Question 5 answer*/
        option51 = (RadioButton) findViewById(R.id.option51);
        boolean options51 = option51.isChecked();

        if (options51) {
            score += 1;
        }
/*Question 2 answer*/
        option82 = (RadioButton) findViewById(R.id.option82);
        boolean options82 = option82.isChecked();

        if (options82) {
            score += 1;
        }
/*Question 2 answer*/
        option21 = (CheckBox) findViewById(R.id.option21);
        option22 = (CheckBox) findViewById(R.id.option22);
        option23 = (CheckBox) findViewById(R.id.option23);
        option24 = (CheckBox) findViewById(R.id.option24);

        if (option21.isChecked() && option23.isChecked() && !option22.isChecked() && !option24.isChecked()) {
            score += 1;
        }
/*Question 6 answer*/
        option61 = (CheckBox) findViewById(R.id.option61);
        option62 = (CheckBox) findViewById(R.id.option62);
        option63 = (CheckBox) findViewById(R.id.option63);
        option64 = (CheckBox) findViewById(R.id.option64);

        if (option61.isChecked() && option63.isChecked() && option64.isChecked() && !option62.isChecked()) {
            score += 1;
        }
/*Question 7 answer*/
        option71 = (CheckBox) findViewById(R.id.option71);
        option72 = (CheckBox) findViewById(R.id.option72);
        option73 = (CheckBox) findViewById(R.id.option73);
        option74 = (CheckBox) findViewById(R.id.option74);


        if (option72.isChecked() && option73.isChecked() && option74.isChecked() && !option71.isChecked()) {
            score += 1;
        }
/*Toast message to display result*/
        Toast.makeText(getBaseContext(), names + ", you got a total of " + score + " marks out of 8!", Toast.LENGTH_SHORT).show();

    }

}
