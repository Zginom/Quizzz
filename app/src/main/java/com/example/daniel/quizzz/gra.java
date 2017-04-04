package com.example.daniel.quizzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class gra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gra);
    }

    public void wynik( View v)
    {
        int wynik = 0;

        RadioGroup rg1 = (RadioGroup)findViewById(R.id.rg1);
        RadioButton rb1 = (RadioButton)findViewById(R.id.rb11);
        int odp1 = rg1.getCheckedRadioButtonId();
        if ( odp1 != -1 ) {
            RadioButton radioButton = (RadioButton)findViewById(odp1);
            if( radioButton.equals(rb1) )
            {
                wynik++;
            }
        }


        ///XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

        RadioGroup rg2 = (RadioGroup)findViewById(R.id.rg2);
        RadioButton rb2 = (RadioButton)findViewById(R.id.rb22);
        int odp2 = rg2.getCheckedRadioButtonId();
        if ( odp2 != -1 ) {
            RadioButton radioButton2 = (RadioButton)findViewById(odp2);
            if( radioButton2.equals(rb2) )
            {
                wynik++;
            }
        }

        ///XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

        RadioGroup rg3 = (RadioGroup)findViewById(R.id.rg3);
        RadioButton rb3 = (RadioButton)findViewById(R.id.rb31);
        int odp3 = rg3.getCheckedRadioButtonId();
        if ( odp3 != -1 ) {
            RadioButton radioButton3 = (RadioButton) findViewById(odp3);
            if (radioButton3.equals(rb3)) {
                wynik++;
            }
        }

        ///XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

        RadioGroup rg4 = (RadioGroup)findViewById(R.id.rg4);
        RadioButton rb4 = (RadioButton)findViewById(R.id.rb42);
        int odp4 = rg4.getCheckedRadioButtonId();
        if ( odp4 != -1 ) {
            RadioButton radioButton4 = (RadioButton) findViewById(odp4);
            if (radioButton4.equals(rb4)) {
                wynik++;
            }
        }
        ///XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

        RadioGroup rg5 = (RadioGroup)findViewById(R.id.rg5);
        RadioButton rb5 = (RadioButton)findViewById(R.id.rb52);
        int odp5 = rg5.getCheckedRadioButtonId();
        if ( odp5 != -1 ) {
            RadioButton radioButton5 = (RadioButton) findViewById(odp5);
            if (radioButton5.equals(rb5)) {
                wynik++;
            }
        }
        ///XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

        String punkty = "";
        if ( wynik == 1) punkty = "Punkt!";
        if ( wynik == 2 || wynik == 3 || wynik == 4) punkty = "Punkty!";
        if ( wynik == 0 || wynik == 5) punkty = "Punktów!";

        Toast.makeText(getApplicationContext(),"Twój wynik to : " + wynik + " " + punkty ,Toast.LENGTH_SHORT).show();
    }
}
