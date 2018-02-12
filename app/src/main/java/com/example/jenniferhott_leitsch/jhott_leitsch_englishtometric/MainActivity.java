package com.example.jenniferhott_leitsch.jhott_leitsch_englishtometric;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double centimeters = 2.54;
    double kilometers = 1.61;
    double meters = .30;
    double grams = 28.35;
    double numberOf;
    double numberEntered;
    String groupChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText conversion = (EditText)findViewById(R.id.txtPrompt);
        final Spinner group = (Spinner)findViewById(R.id.txtGroup);
        final Button find = (Button)findViewById(R.id.btnConversions);
        find.setOnClickListener(new View.OnClickListener() {
            final TextView result = ((TextView)findViewById(R.id.txtResult));
            @Override
            public void onClick(View v) {
                numberOf = Double.parseDouble(conversion.getText().toString());
                groupChoice = group.getSelectedItem().toString();
                switch (groupChoice){
                    case "Inch to Centimeters":
                        numberEntered = numberOf * centimeters;
                        result.setText("The conversion result for " + groupChoice + " is " + numberEntered);
                        break;

                    case "Miles to Kilometers":
                        numberEntered = numberOf * kilometers;
                        result.setText("The conversion result for " + groupChoice + " is " + numberEntered);
                        break;

                    case "Feet to Meters":
                        numberEntered = numberOf * meters;
                        result.setText("The conversion result for " + groupChoice + " is " + numberEntered);
                        break;

                    case "Ounce to Grams":
                        numberEntered = numberOf * grams;
                        result.setText("The conversion result for " + groupChoice + " is " + numberEntered);
                        break;

                    default:
                        break;
                }
            }
        });
    }
}
