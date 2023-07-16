package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText entrybox;
    Button convertbutton;
   TextView resulttextview , welcometext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connecting all designed widgets

        entrybox = findViewById(R.id.entrybox);
        convertbutton = findViewById(R.id.convertbutton);
        resulttextview = findViewById(R.id.resulttextView);
        welcometext = findViewById(R.id.welcometext);

        convertbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Command to get input from user
            int kilos_entred = Integer.parseInt(entrybox.getText().toString());

            //To show the results to user

            resulttextview.setText(""+ convertToGrams(kilos_entred) +"grams");
            }
        });


    }

    //Adding Functionalities to convert

    public int convertToGrams(int kilos){
    int grams_result = kilos*1000;
    return grams_result;
    }







}
